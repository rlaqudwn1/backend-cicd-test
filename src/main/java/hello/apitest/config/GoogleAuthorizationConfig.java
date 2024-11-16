//package hello.apitest.config;
//
//import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
//import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
//import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
//import com.google.api.client.json.JsonFactory;
//import com.google.api.client.json.gson.GsonFactory;
//import com.google.api.services.calendar.CalendarScopes;
//import org.springframework.stereotype.Component;
//
//import java.io.InputStreamReader;
//import java.util.Collections;
//
//@Component
//public class GoogleAuthorizationConfig {
//
//    private static final String CLIENT_SECRET_FILE = "/client_secret.json";
//    private static final JsonFactory JSON_FACTORY = GsonFactory.getDefaultInstance();
//
//    public GoogleAuthorizationCodeFlow getFlow() throws Exception {
//        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY,
//                new InputStreamReader(getClass().getResourceAsStream(CLIENT_SECRET_FILE)));
//
//        return new GoogleAuthorizationCodeFlow.Builder(
//                GoogleNetHttpTransport.newTrustedTransport(), JSON_FACTORY, clientSecrets,
//                Collections.singleton(CalendarScopes.CALENDAR))
//                .setAccessType("offline")
//                .build();
//    }
//}
