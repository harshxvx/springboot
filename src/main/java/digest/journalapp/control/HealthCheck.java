package digest.journalapp.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

   @GetMapping("abc")
   public String healthcheck() {
        return "OK";
    }
}
