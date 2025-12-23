package com.adrar.sitespring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping("/{firstname}")
    public String home(Model model, @PathVariable String firstname) {
        model.addAttribute(firstname);
        return "home";
    }


}
