package com.java5.lab1.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class AuthController {

    @Autowired
    private HttpServletRequest req;

    @GetMapping("/form")
    public String form(Model model){
        return "login";
    }

    @PostMapping ("/form")
    public String login(Model model){
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        boolean check = "FPT".equalsIgnoreCase(username) && "123".equals(password);

        model.addAttribute("title","login");
        model.addAttribute("username",username);
        model.addAttribute("message", check?"Login success":"Login false");

        return "login";
    }
}
