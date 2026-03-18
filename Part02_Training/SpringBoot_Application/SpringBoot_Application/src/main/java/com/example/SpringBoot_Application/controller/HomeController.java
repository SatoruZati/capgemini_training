package com.example.SpringBoot_Application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "    <h1>Home Page</h1>\n" +
                "    <p>\n" +
                "        Hello World!\n" +
                "    </p>";
    }


    @GetMapping("/about")
    public String about() {
        return "<h3>About Spring Boot Application</h3>";
    }

    @GetMapping("/login")
    public String login() {
        return "<h3>Login</h3>";
    }

    @GetMapping("/signup")
    public String signup() {
        return "<h3>Signup</h3>";
    }

    @GetMapping("/youtube")
    public String youtube(RedirectAttributes redirectAttributes) {
        // redirect to youtube.com
        return "redirect:https://www.youtube.com/";
    }
}