package com.zhou.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class shiroController {


    @RequestMapping({"/","index"})
    public String toIndex(Model model)
    {
        model.addAttribute("msg","hello,world");
        return "index";
    }
}
