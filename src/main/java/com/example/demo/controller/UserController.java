package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;




@RestController
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	UserService userService;
	
	
	@RequestMapping("/getAll")
	
	
	
	public List<Sysuser>
}
