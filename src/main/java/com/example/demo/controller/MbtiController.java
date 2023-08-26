package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Users;
import com.example.demo.service.UserService;

@Controller
public class MbtiController {

	@Autowired
	private UserService userService;

	@GetMapping("/list")
	public String getList() {
		Map<String, List<Users>> userListMap = userService.getUerLists();
		System.out.println(userListMap);
		return "/list";
	}

	@GetMapping("/add")
	public String getAdd() {
		return "/add";
	}

	//	@PostMapping("/add")
	//	public String postAdd() {
	//		return "redirect:/list";
	//	}

	@GetMapping("/update")
	public String getUpdate() {
		return "/update";
	}

	//	@PostMapping("/add")
	//	public String postUpdate() {
	//		return "redirect:/list";
	//	}
}
