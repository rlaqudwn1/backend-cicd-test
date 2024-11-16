package hello.apitest.seoul.controller;


import hello.apitest.seoul.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
@CrossOrigin(origins = "http://localhost:3000") // React 앱에서 오는 요청을 허용
public class ApiController {

    private final ApiService apiService;

    @Autowired
    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }
    @GetMapping("/sport-facility")
    public ResponseEntity<?> getSportFacility(@RequestParam String facilityName) {
        return ResponseEntity.status(200).body(apiService.fetchSportFacilityData(facilityName));
    }
}
