//package hello.apitest.googleCalendar.controllers;
//
//import hello.apitest.googleCalendar.dto.EventRequest;
//import hello.apitest.googleCalendar.service.GoogleCalendarService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//import java.io.IOException;
//import java.security.GeneralSecurityException;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/api/calendar")
//public class CalendarController {
//
//    private final GoogleCalendarService googleCalendarService;
//
//    @PostMapping("/addEvent")
//    public String addEvent(@RequestBody EventRequest eventRequest) throws GeneralSecurityException, IOException {
//        return googleCalendarService.addEvent(eventRequest);
//    }
//}
