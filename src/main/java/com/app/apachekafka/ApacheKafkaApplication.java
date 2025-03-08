package com.app.apachekafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Consumer {

    @GetMapping("")
    String consume() {
        return "Hello, World";
    }

}


@SpringBootApplication
public class ApacheKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApacheKafkaApplication.class, args);
    }

}
