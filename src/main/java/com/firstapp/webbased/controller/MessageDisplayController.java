package com.firstapp.webbased.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageDisplayController {
	
	@RequestMapping(value="/")
	public String hello() {
		return "Aloha!! Welcome to Valuelabs!!";
	}

}
