import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class httpTest {
    public static void main(String[] args) {
        URL url = null;
        HttpURLConnection conn = null;

        //http 통신 요청 후 응답 받은 데이터를 담기 위한 변수
        String responseData = null;
        BufferedReader br = null;
        StringBuffer sb = null;
        //String urlWithParams = apiUrl.trim() + "?userid=" + userId + "&otpnum=" + otp;
        String urlWithParams = "https://172.21.4.208:8443/WiseOTP";

        System.out.println("url : " + urlWithParams);


        //메소드 호출 결과값을 반환하기 위한 변수
        String returnData = "";
        try {
            url = new URL(urlWithParams);
            //파라미터로 들어온 url을 사용해 connection 실시
            conn = (HttpURLConnection) url.openConnection();

            // Read Timeout Setting
            conn.setReadTimeout(2000);
            // Connection Timeout setting
            conn.setConnectTimeout(2000);

            //http 요청에 필요한 타입 정의 실시
            conn.setRequestMethod("GET");

            //http 요청 실시
            conn.connect();

            //http 요청 후 응답 받은 데이터를 버퍼에 쌓는다
            br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            sb = new StringBuffer();
            while ((responseData = br.readLine()) != null) {
                sb.append(responseData);
            }

            //메소드 호출 완료 시 반환하는 변수에 버퍼 데이터 삽입 실시
            returnData = sb.toString();

            String responseCode = String.valueOf(conn.getResponseCode());
            System.out.println("http 응답 코드 : " + responseCode);
            System.out.println("http 응답 메시지 : " + conn.getResponseMessage());
            //System.out.println("http 응답 데이터 : " + returnData);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //http 요청 및 응답 완료 후 BufferedReader를 닫아줍니다
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
