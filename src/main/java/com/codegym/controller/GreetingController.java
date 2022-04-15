package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

//danh dau la controller
@Controller
public class GreetingController {
    //khai bao 1 phuong thuc co duong dan la /home
    @GetMapping("/home")
    public String greeting(){
        return "home";
    }

    @GetMapping("/user")
    public ModelAndView getAllUser(){
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("dsHV", "Danh sach HV C12");
        modelAndView.addObject("tenGV", "Vu Kieu Anh");
        return modelAndView;
    }

}
