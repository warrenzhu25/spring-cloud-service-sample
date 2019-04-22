package com.example;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Cacheable("hello")
    @GetMapping(value = "/{name}")
    public String sayHello(@PathVariable String name) {
        return String.format("Hello %s", name);
    }
}

