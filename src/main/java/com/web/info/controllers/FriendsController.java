package com.web.info.controllers;

import com.web.info.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FriendsController {
	private final FriendService checkService;

	@Autowired
	public FriendsController(FriendService checkService) {
		this.checkService = checkService;
	}

	@PostMapping("/Checks")
	@ResponseBody
	public void showDataCheck() {
		System.out.println(checkService.findAll());
	}
}
