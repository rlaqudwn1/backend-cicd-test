//package hello.apitest.googleCalendar.service;
//
//import com.google.api.client.util.DateTime;
//import com.google.api.services.calendar.Calendar;
//import com.google.api.services.calendar.model.Event;
//import com.google.api.services.calendar.model.EventDateTime;
//import hello.apitest.googleCalendar.dto.EventRequest;
//import org.springframework.stereotype.Service;
//
//import java.io.IOException;
//import java.security.GeneralSecurityException;
//import java.util.TimeZone;
//
//import static hello.apitest.config.AuthCalendarUtil.getCalendarService;
//
//@Service
//public class GoogleCalendarService {
//
//    public String addEvent(EventRequest eventRequest) throws GeneralSecurityException, IOException {
//        // 캘린더 서비스 객체 초기화
//        Calendar calendarService = getCalendarService();
//
//        // 새로운 이벤트 생성
//        Event event = new Event()
//                .setSummary(eventRequest.getSummary())
//                .setLocation(eventRequest.getLocation())
//                .setDescription(eventRequest.getDescription());
//
//        // 이벤트 시작 시간 설정
//        DateTime startDateTime = new DateTime(eventRequest.getStartTime());
//        EventDateTime start = new EventDateTime()
//                .setDateTime(startDateTime)
//                .setTimeZone(TimeZone.getTimeZone("Asia/Seoul").getID());
//        event.setStart(start);
//
//        // 이벤트 종료 시간 설정
//        DateTime endDateTime = new DateTime(eventRequest.getEndTime());
//        EventDateTime end = new EventDateTime()
//                .setDateTime(endDateTime)
//                .setTimeZone(TimeZone.getTimeZone("Asia/Seoul").getID());
//        event.setEnd(end);
//
//        // 이벤트 생성 요청 실행
//        try {
//            event = calendarService.events().insert("primary", event).execute();
//            return "Event created: " + event.getHtmlLink();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new IOException("Error creating event.", e);
//        }
//    }
//}
