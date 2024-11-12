package com.example.collaborativeide.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IdeController {

    @GetMapping("/")
    public String getIndexPage() {
        return "index";
    }

    @GetMapping("/code-ide")
    public String getCodeIdePage() {
        return "code-ide";
    }
}
