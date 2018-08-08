package com.ets.csm.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;



@Controller
public class MainController {
	
	
	 @RequestMapping("/default")
	    public String defaultAfterLogin(HttpServletRequest request) {
		 System.out.println("USER_ROLE"+request.isUserInRole("ROLE_ADMIN"));
	        if (request.isUserInRole("ROLE_ADMIN")) {
	        	
	            return "redirect:/admin/";
	            
	        }
	        else if(request.isUserInRole("ROLE_USER"))
	        {
	        	
	          return "redirect:/user/";
	        }else 
	        	
	          return "Access is not Defined";
	    }

	@GetMapping({"/login", "/"})
	public String welcome() {
		
		return "/login";
	}
	@PostMapping("/home")
	public String homePage() {
		
		return "/homePage";
	}
	 @GetMapping("/access-denied")
	 public String accessDenied(){
		
		 return "access-denied";
	 }
	

		
	 
}
