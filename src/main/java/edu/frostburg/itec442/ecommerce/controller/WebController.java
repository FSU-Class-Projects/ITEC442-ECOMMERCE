package edu.frostburg.itec442.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String helloworld(){
        return "helloworld";
    }
}
