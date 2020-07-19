package com.onlineshop.shoppingcart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/dashboard")
@Slf4j
public class DashboardController {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(DashboardController.class);

	@GetMapping
	public String getDashboard() {

		return "index";
	}

}
