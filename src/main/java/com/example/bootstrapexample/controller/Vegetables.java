package com.example.bootstrapexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Vegetables {
    @GetMapping
    public String generateVegetablesPage(Model model) {
        return "index";
    }
}
