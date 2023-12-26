package com.web.info.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class BaseController {

    @GetMapping("/")
    public String tables() {
        return "index";
    }

}
