package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
//khai bao tien to cho tat ca method trong class
@RequestMapping("/customers")
public class UserController {
//    quy dinh method  luon
    @GetMapping("")
    public String getAllCustomer(){
        System.out.println("ds");
        return null;
    }
//    khai bao uri cho phuong thuc, quy dinh method cho phuong thuc
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getCustomerById(@PathVariable Integer id){
        System.out.println("Chi tiet" + id);
        return null;
    }

    @GetMapping("/search")
    public String findByName(@RequestParam String name, @RequestParam String address){
        System.out.println("tim kiem " + name + address);
        return null;
    }

    //String
    @GetMapping("/ds")
    public String demo(Model model){
        model.addAttribute("ds", "Danh sach mac dinh");
        return "demo";
    }
    //ModelAndView
    @GetMapping("/tk")
    public ModelAndView demotk(){
//        ModelAndView modelAndView = new ModelAndView("demo", "ds", "ds da tim kiem");
        ModelAndView modelAndView = new ModelAndView("demo");
        modelAndView.addObject("ds", "Danh sach da dc tim kiem");
        return modelAndView;
    }
    //ModelMaps
    @GetMapping("/demo1")
    public String demo1(ModelMap modelMap){
        modelMap.addAttribute("ds", "Ds Demo");
        return "demo";
    }
}
