//package hello.apitest.config;
//import com.google.api.client.auth.oauth2.Credential;
//import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
//import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
//import com.google.api.client.http.javanet.NetHttpTransport;
//import com.google.api.client.json.JsonFactory;
//import com.google.api.client.json.gson.GsonFactory;
//import com.google.api.services.calendar.Calendar;
//import com.google.api.services.calendar.CalendarScopes;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//import java.security.GeneralSecurityException;
//import java.util.Collections;
//import java.util.List;
//
//@Component
//public class AuthCalendarUtil {
//    @Value("${google.client.id}")
//    private static String clientId;
//
//    @Value("${google.client.secret}")
//    private static String clientSecret;
//
//    @Value("${google.refresh.token}")
//    private static String refreshToken;
//
//    private static final String APPLICATION_NAME = "Google Calendar API Java Quickstart";
//    private static final JsonFactory JSON_FACTORY = GsonFactory.getDefaultInstance();
//    private static final List<String> SCOPES = Collections.singletonList(CalendarScopes.CALENDAR_READONLY);
//
//    public static Calendar getCalendarService() throws IOException, GeneralSecurityException {
//        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
//
//
//
//        if (clientId == null || clientSecret == null || refreshToken == null) {
//            throw new IllegalStateException("Required environment variables are not set.");
//        }
//
//        Credential credential = new GoogleCredential.Builder()
//                .setTransport(HTTP_TRANSPORT)
//                .setJsonFactory(JSON_FACTORY)
//                .setClientSecrets(clientId, clientSecret)
//                .build()
//                .setRefreshToken(refreshToken);
//
//        return new Calendar.Builder(HTTP_TRANSPORT, JSON_FACTORY, credential)
//                .setApplicationName(APPLICATION_NAME)
//                .build();
//    }
//}