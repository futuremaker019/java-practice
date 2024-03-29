import javax.net.ssl.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;

public class HttpTest {
    public static void main(String[] args) throws IOException {
        String result = httpsGetForOtpApi();

        System.out.println(result);
    }


    public static String httpsGetForOtpApi() throws IOException {

        //String urlWithParams = apiUrl.trim() + "?userid=" + userId + "&otpnum=" + otp;

        //System.out.println("url : " + urlWithParams);

        String urlString = "https://172.21.4.208:8443/WiseOTP";

        String line = null;
        InputStream in = null;
        BufferedReader reader = null;
        StringBuffer sb = null;
        HttpsURLConnection httpsConn = null;

        try {
            // Get HTTPS URL connection
            URL url = new URL(urlString);
            httpsConn = (HttpsURLConnection) url.openConnection();

            // Set Hostname verification
            httpsConn.setHostnameVerifier(new HostnameVerifier() {
                // Ignore host name verification. It always returns true.
                @Override
                public boolean verify(String hostname, SSLSession session) { return true; }
            });

            TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
                public X509Certificate[] getAcceptedIssuers() { return null; }
                public void checkClientTrusted(X509Certificate[] certs, String authType){}
                public void checkServerTrusted(X509Certificate[] certs, String authType) {}
            } };

            // Input setting
            httpsConn.setDoInput(true);
            // Output setting
            //httpsConn.setDoOutput(true);
            // Caches setting
            httpsConn.setUseCaches(false);
            // Read Timeout Setting
            httpsConn.setReadTimeout(1000);
            // Connection Timeout setting
            httpsConn.setConnectTimeout(1000);
            // Method Setting(GET/POST)
            httpsConn.setRequestMethod("GET");
            // Header Setting
            //httpsConn.setRequestProperty("HeaderKey","HeaderValue");

            int responseCode = httpsConn.getResponseCode();
            System.out.println("응답코드 : " + responseCode);
            System.out.println("응답메세지 : " + httpsConn.getResponseMessage());

            // SSL setting
            SSLContext context = SSLContext.getInstance("TLS");
            context.init(null, trustAllCerts, new SecureRandom()); // No validation for now
            httpsConn.setSSLSocketFactory(context.getSocketFactory());

            // Connect to host
            httpsConn.connect();
            httpsConn.setInstanceFollowRedirects(true);

            // Print response from host
            // if (responseCode == HttpsURLConnection.HTTP_OK) { // 정상 호출 200
//                in = httpsConn.getInputStream();
            //} else { // 에러 발생
//                in = httpsConn.getErrorStream();
            //}

            reader = new BufferedReader(new InputStreamReader(httpsConn.getInputStream(), "UTF-8"));
            sb = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }

            line = sb.toString();

            reader.close();

        } catch (UnknownHostException e) {
            System.out.println("UnknownHostException : " + e);
        } catch (MalformedURLException e) {
            System.out.println(urlString + " is not a URL I understand");
        } catch (IOException e) {
            System.out.println("IOException :" + e);
        } catch (Exception e) {
            System.out.println("error : " + e);
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (httpsConn != null) {
                httpsConn.disconnect();
            }
        }

        return line;
    }
}
