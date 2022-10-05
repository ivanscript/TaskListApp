package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontControllers {

    @GetMapping("/")
    private String index(){
        return "index";
        //Este es el nombre de la plantilla thymeleaf o html que queremos devolver
    }
/*
    @GetMapping("/task1")
    public String tasks(){
        return "tasks";
    }

 */
}
