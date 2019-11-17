package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hello.model.MyJSONResult;

@Controller
@RequestMapping("err")
public class ErrorController {

	@RequestMapping("/error")
	public String error() {
		
		int a = 1 / 0;
		
		return "error";
	}
	
	@RequestMapping("/ajaxerror")
	public String ajaxerror() {
		
		return "thymeleaf/ajaxerror";
	}
	
	@RequestMapping("/getAjaxerror")
	@ResponseBody
	public MyJSONResult getAjaxerror() {
		
		int a = 1 / 0;
		
		return MyJSONResult.ok();
	}
}