import javax.net.ssl.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Locale;

public class TestSSLCall {
    public static void main(String[] args) {
        String url = "https://uins.iptime.org:8443/WiseOTP/centerFrames/userPage/authAPI.jsp?userid=geps1&otpnum=112233";
        String resultData = "";
        try {
            URL aURL = new URL(url);

            if (aURL.getProtocol().equals("https")) {
                resultData = httpsGet(url);
                System.out.println("https resultData : " + resultData);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static String httpsGet(String strUrl) {
        URL url = null;
        HttpURLConnection conn = null;
        String ret = "";

        try {
            url = new URL(strUrl);
            ignoreSSL();
            conn = (HttpsURLConnection) url.openConnection();

            BufferedReader br = null;
            br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String input = null;

            while ((input = br.readLine()) != null) {
                ret += input;
            }

            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }

        return ret;
    }

    private static void ignoreSSL() throws NoSuchAlgorithmException, KeyManagementException {
        HostnameVerifier hv = new HostnameVerifier() {
            @Override
            public boolean verify(String s, SSLSession sslSession) {
                return false;
            }
        };

        trustAllHttpCertificates();
        HttpsURLConnection.setDefaultHostnameVerifier(hv);
    }

    private static void trustAllHttpCertificates() throws NoSuchAlgorithmException, KeyManagementException {
        TrustManager[] trustAllCerts = new TrustManager[1];

        TrustManager tm = new miTM();
        trustAllCerts[0] = tm;

        SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, null);
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

    }

    static class miTM implements TrustManager, X509TrustManager {
        public boolean isServerTrusted(X509Certificate[] cert){
            return true;
        }

        public boolean isClientTrusted(X509Certificate[] cert) {
            return true;
        }

        @Override
        public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
            return;
        }

        @Override
        public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
            return;
        }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    }


}
