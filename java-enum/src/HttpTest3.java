import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;

public class HttpTest3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();
        String line = null;

        try {
            String htmlUrl = "https://api.lootbox.eu/pc/kr/OVERWATCH-31757/profile";

            TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
                public void checkClientTrusted(X509Certificate[] certs, String authType) {		}
                public void checkServerTrusted(X509Certificate[] certs, String authType) {		}

            }};

            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
            HttpsURLConnection conn = (HttpsURLConnection) new URL(htmlUrl).openConnection();

            int responseCode = conn.getResponseCode();
            String responseMessage = conn.getResponseMessage();

            System.out.println("responseCode = " + responseCode);
            System.out.println("responseMessage = " + responseMessage);

            InputStream is = conn.getInputStream();
            br = new BufferedReader(new InputStreamReader(is, "UTF-8"));

            while ((line = br.readLine()) != null) {
                sb.append(line);
            }} catch (NoSuchAlgorithmException | IOException | KeyManagementException e) {
            e.printStackTrace();
        }

        System.out.println(sb.toString());
    }
}
