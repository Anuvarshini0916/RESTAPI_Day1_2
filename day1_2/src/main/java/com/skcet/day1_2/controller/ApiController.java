package com.skcet.day1_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@GetMapping("get")
public String getname()
{
	
	String studentName="iamneo";
	return "welcome "+studentName +"!";
}
}
