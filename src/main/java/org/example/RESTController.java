package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }
}
