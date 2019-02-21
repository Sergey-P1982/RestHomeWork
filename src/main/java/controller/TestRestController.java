package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class TestRestController {

    @RequestMapping("/hello")
    public String sendHi(){
        return "Hi!";
    }
}
