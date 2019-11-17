package com.hello.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hello.model.MyJSONResult;

@RestControllerAdvice
public class MyAjaxExceptionHandler {

	@ExceptionHandler(value = Exception.class)
	public MyJSONResult defaultErrorHandler(HttpServletRequest req, 
			Exception e) throws Exception {

		e.printStackTrace();
		return MyJSONResult.errorException(e.getMessage());
	}
}
