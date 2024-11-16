package hello.apitest.test.testcontoller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("test")
public class TestController {
    @GetMapping
    public ResponseEntity<?> test() {
        return ResponseEntity.status(200).body(Map.of("hello", "world"));
    }
    @GetMapping("/1")
    public ResponseEntity<?> test1() {
        return ResponseEntity.status(200).body(Map.of("hello", "world"));
    }
}
