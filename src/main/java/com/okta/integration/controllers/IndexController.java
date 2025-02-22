package com.okta.integration.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/")
    public String home() {
        return "Welcome to the home page!";
    }

    @GetMapping("/secured")
    public String secured() {
        return "This is a secured page!";
    }
}
