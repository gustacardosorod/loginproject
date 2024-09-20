package com.example.loginproject.controller;

import com.example.loginproject.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String loginSubmit(User user, Model model) {
        if ("admin".equals(user.getUsername()) && "1234".equals(user.getPassword())) {
            return "redirect:/welcome";
        } else {
            return "redirect:/error";
        }
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }
}
