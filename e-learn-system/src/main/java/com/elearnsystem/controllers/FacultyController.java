package com.elearnsystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elearnsystem.models.Faculty;

@Controller
public class FacultyController {
	@RequestMapping(value = "/faculty",method = RequestMethod.GET)
	public String facultyLogin(Model model) {
	    Faculty faculty= new Faculty();
		model.addAttribute(faculty);
		return "facultylogin";
	}
	 

}
