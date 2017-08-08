package com.davidepugliese.springbootstarter.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

//@RequestMapping("/user")
public class IndexController {
    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        return "index";
    }
}

