package com.onlineconsulting.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.onlineconsulting.services.UserService;

@Controller
public class HomeController {
	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("users", userService.getUserByLastName("Bauer"));
		return "index";
	}
}
