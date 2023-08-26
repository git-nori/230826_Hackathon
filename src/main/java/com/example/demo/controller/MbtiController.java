package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	@PostMapping("/add")
	public String postAdd() {
		return "redirect:/list";
	}
	
	@GetMapping("/update")
	public String getUpdate() {
		return "/update";
	}
	
	@PostMapping("/add")
	public String postUpdate() {
		return "redirect:/list";
	}
}
