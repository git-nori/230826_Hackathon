package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.AddForm;
import com.example.demo.model.Users;
import com.example.demo.service.UserService;

@Controller
public class MbtiController {

	@Autowired
	private ModelMapper modelMapper;

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

	@PostMapping("/add")
	public String add(Model model, @ModelAttribute AddForm form) {

		Users user = modelMapper.map(form, Users.class);
		userService.insertUser(user);

		return "redirect:/list";
	}

	@GetMapping("/update")
	public String getUpdate() {
		return "/update";
	}

	// @PostMapping("/add")
	// public String postUpdate() {
	// return "redirect:/list";
	// }
}
