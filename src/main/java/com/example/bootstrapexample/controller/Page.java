package com.example.bootstrapexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Page {
    @GetMapping
    public String generateIndexPage(Model model) {
        return "index";
    }

    @GetMapping(value = "/second")
    public String generateSecondPage() {
        return "second";
    }

}
