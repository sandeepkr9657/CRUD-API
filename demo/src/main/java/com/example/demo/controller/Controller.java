package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class Controller {

	@Autowired
	UserService userService;

	@PostMapping("/create/user")
	public String create(@RequestBody User user) {
    return userService.add(user);	
	}

	
	@GetMapping("/get/user")
	public User get(@RequestParam Integer id) {
		User user =userService.get(id);
		return user;
	}

	@PutMapping("/update/user")
	public String update(@RequestBody User user) {
    return userService.update(user);	
	}
	
	@PutMapping("/delete/user")
	public String delete(@RequestParam Integer id) {
    return userService.delete(id);	
	}
}
