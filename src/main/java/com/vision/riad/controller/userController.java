package com.vision.riad.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class userController {
	
	@RequestMapping("test")
	public String test() {
		return "ca marche , ja wa7d zaml";
	}

}
