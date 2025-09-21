package com.java5.lab1.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {

    @RequestMapping("/java5/hello")
    public String hello(Model model){
        model.addAttribute("subject","Spring Boot MVC");
        model.addAttribute("message", "Bui Hoang Vuong");
        return "Hello";
    }
}
