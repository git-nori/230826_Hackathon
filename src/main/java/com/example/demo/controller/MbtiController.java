package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MbtiController {
	
	@GetMapping("/list")
	public String getList() {
		return "/list";
	}
	
	
	@GetMapping("/add")
	public String getAdd() {
		return "/add";
	}
	
	@GetMapping("/update")
	public String getUpdate() {
		return "/update";
	}
}
