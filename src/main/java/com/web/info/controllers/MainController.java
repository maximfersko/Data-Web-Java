package com.web.info.controllers;

import com.web.info.services.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {


    private final FriendService friendService;

    @Autowired
    public MainController(FriendService checkServices) {
        this.friendService = checkServices;
    }

    @GetMapping("/")
    public String tables() {
        return "index";
    }

    @PostMapping("/data")
    @ResponseBody
    public void showDataCheck() {
        System.out.println(friendService.findAll());
    }

}
