package com.example.loginproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeveloperController {

    @GetMapping("/developer")
    public String developerInfo(Model model) {
        model.addAttribute("name", "Gustavo Cardoso Rodrigues");
        model.addAttribute("description", "Desenvolvedor de software  em aplicações Java.");
        return "developer";
    }
}
