package org.launchcode.Chapter4.Lecture.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {

    @GetMapping
    public String index() {
        return "home";
    }

}
