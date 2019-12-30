package com.vision.riad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vision.riad.dao.UserDB;
import com.vision.riad.model.User;


@RestController
public class userController {
	
	@Autowired
	private UserDB userDB;
	
	@RequestMapping("test")
	public String test() {
		return "allez si brahim allez";
	}
	
	@RequestMapping("use")
	public List<User> users() {
		return userDB.findAll();
	}

}
