package com.github.esgoet.hhjava243springweb;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")
public class HelloWorldController {

    @GetMapping
    public String helloWorld() {
        return "Hello, World!";
    }

    @GetMapping("/{name}")
    public String getPersonalHello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}
