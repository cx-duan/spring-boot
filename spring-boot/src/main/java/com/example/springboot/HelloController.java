package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //ready to use by Spring MVC to handle web requests
public class HelloController {

    @GetMapping("/") //maps "/" to the index() method. Invoked by browser or using curl -> returns pure text,
    //RestController combines @Controller and @ResponseBody
    public String index() {
        return "Greetings from Spring Boot!";
    }

}