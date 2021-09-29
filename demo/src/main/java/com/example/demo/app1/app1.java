package com.example.demo.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@SpringBootApplication
public class app1 {

    @GetMapping("/")
    public String home() {
        return "Csá";
    }

    @GetMapping("/kecske")
    public String kecske() {
        return "Mivan";
    }

    public static void main(String[] args) {
        SpringApplication.run(app1.class, args);
    }
}