package com.java5.lab1.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/rectangle")
public class RectangleController {

    @GetMapping("/form")
    public  String form(Model model){
        return "rectangle";
    }

    @PostMapping("/calc")
     public String calc(
             @RequestParam double width,
             @RequestParam double length,
             Model model
    ){
        model.addAttribute("width", width);
        model.addAttribute("length", length);
        model.addAttribute("area", width*length);
        model.addAttribute("perimeter", 2*(length+width));

        return "rectangle";
    }
}
