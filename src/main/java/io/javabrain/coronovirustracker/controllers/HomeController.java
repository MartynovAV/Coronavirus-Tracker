package io.javabrain.coronovirustracker.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    public String Home(){
        return "home";
    }
}
