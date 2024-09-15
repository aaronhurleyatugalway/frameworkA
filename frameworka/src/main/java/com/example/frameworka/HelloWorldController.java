package com.example.frameworka;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloWorldController {
    @GetMapping(value="hello")
    public String getHelloWorld() {
        return "Howya Silly Sillies";
    }
    
    
}
