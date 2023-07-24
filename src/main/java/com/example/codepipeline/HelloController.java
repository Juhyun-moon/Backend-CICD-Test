package com.example.codepipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + "moon";
    }

    @GetMapping("/")
    public String root() {
        return "Hi This page is modified";
    }
}
