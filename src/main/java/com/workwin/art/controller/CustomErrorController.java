package com.workwin.art.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController{
	
	
	   @RequestMapping("/error")
	   public String handleError(HttpServletRequest request) {
	       // Your custom error handling logic goes here
		   Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		   if(status != null) {
			   Integer statusCode = Integer.valueOf(status.toString());
			    
		        if(statusCode == HttpStatus.NOT_FOUND.value()) {
		            return "error-404";
		        }
		        else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
		            return "error-500";
		        }
		   }
	       return "error"; // Return the name of your custom error page
	   }

	   public String getErrorPath() {
	       return "/error";
	   }

}
