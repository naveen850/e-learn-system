package com.elearnsystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elearnsystem.models.Admin;
import com.elearnsystem.models.Faculty;
@Controller
public class AdminController {
	 @RequestMapping(value = "/admin",method = RequestMethod.GET)
	public String adminLogin(Model model)
	{
		 Admin admin=new Admin();
		 model.addAttribute(admin);
		return "adminlogin";
	}
	 @RequestMapping(value = "/login",method = RequestMethod.POST)
	 public String login(@ModelAttribute("admin") Admin admin)
	 {
		 return "adminservices";
	 }
	

}
