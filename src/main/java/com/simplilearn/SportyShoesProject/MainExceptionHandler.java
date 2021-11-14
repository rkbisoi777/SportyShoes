package com.simplilearn.SportyShoesProject;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class MainExceptionHandler {
	@ExceptionHandler(Exception.class)
	public String handleException1(Exception e) {
		e.printStackTrace();
		return "Some error has occurred, please contact to administrator";
	}
}