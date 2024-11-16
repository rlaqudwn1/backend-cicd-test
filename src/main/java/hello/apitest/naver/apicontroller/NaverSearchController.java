//package hello.apitest.naver.apicontroller;
//
//import hello.apitest.naver.entity.BlogItems;
//import hello.apitest.naver.service.NaverSearchService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.io.*;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.HashMap;
//import java.util.Map;
//import java.net.URLEncoder;
//import java.nio.charset.StandardCharsets;
//
//@RestController
//@RequiredArgsConstructor
//public class NaverSearchController {
//    private final NaverSearchService naverSerachSerivce;
//
//    @Value("${naver.client.id}")
//    private String clientId;
//
//    @Value("${naver.client.secret}")
//    private String clientSecret;
//
//    @GetMapping("/search")
//    public String search(@RequestParam String query) throws UnsupportedEncodingException {
//        String encodedQuery = URLEncoder.encode(query, StandardCharsets.UTF_8.toString());
//        String apiUrl = "https://openapi.naver.com/v1/search/blog.json?query=" + encodedQuery;
//
//        Map<String, String> requestHeaders = new HashMap<>();
//        requestHeaders.put("X-Naver-Client-Id", clientId);
//        requestHeaders.put("X-Naver-Client-Secret", clientSecret);
//        String responseBody = get(apiUrl, requestHeaders);
//
//        BlogItems items = naverSerachSerivce.parsingJsonObject(responseBody);
//        System.out.println("items = " + items);
//        return get(apiUrl, requestHeaders);
//    }
//
//    private String get(String apiUrl, Map<String, String> requestHeaders) {
//        HttpURLConnection con = connect(apiUrl);
//        try {
//            con.setRequestMethod("GET");
//            for (Map.Entry<String, String> header : requestHeaders.entrySet()) {
//                con.setRequestProperty(header.getKey(), header.getValue());
//            }
//
//            int responseCode = con.getResponseCode();
//            if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 호출
//                return readBody(con.getInputStream());
//            } else { // 에러 발생
//                return readBody(con.getErrorStream());
//            }
//        } catch (IOException e) {
//            throw new RuntimeException("API 요청과 응답 실패", e);
//        } finally {
//            con.disconnect();
//        }
//    }
//
//    private HttpURLConnection connect(String apiUrl) {
//        try {
//            URL url = new URL(apiUrl);
//            return (HttpURLConnection) url.openConnection();
//        } catch (MalformedURLException e) {
//            throw new RuntimeException("API URL이 잘못되었습니다. : " + apiUrl, e);
//        } catch (IOException e) {
//            throw new RuntimeException("연결이 실패했습니다. : " + apiUrl, e);
//        }
//    }
//
//    private String readBody(InputStream body) {
//        InputStreamReader streamReader = new InputStreamReader(body);
//        try (BufferedReader lineReader = new BufferedReader(streamReader)) {
//            StringBuilder responseBody = new StringBuilder();
//            String line;
//            while ((line = lineReader.readLine()) != null) {
//                responseBody.append(line);
//            }
//            return responseBody.toString();
//        } catch (IOException e) {
//            throw new RuntimeException("API 응답을 읽는데 실패했습니다.", e);
//        }
//    }
//}
