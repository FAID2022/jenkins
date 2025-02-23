package org.emi.jenkins;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
    @PostMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hello "+ name;
    }
}
