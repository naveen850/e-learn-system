package com.elearnsystem.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.elearnsystem.models.Course;
import com.elearnsystem.services.AdminServices;




@Controller
//@RequestMapping("/admin1")
public class AdminController {
	@Autowired
	private AdminServices adminservices;
    @RequestMapping(value="/admin",method=RequestMethod.GET)
	public String login()
	{
	return "adminlogin";	
	}
    @RequestMapping(value="/adminLoginProcess",method=RequestMethod.POST)
    public String adminLoginProcess(@RequestParam("username") String username,@RequestParam("password") String password,Model model,HttpSession session)
    {
    	if(username.equals("veena") && password.equals("veena123"))
    	{
    		model.addAttribute("username", username);
    		session.setAttribute("username", username);
    		return "adminhome";
    	}else
    	{
    		return "adminlogin";
    	}
    }
    
    @RequestMapping(value="/course",method=RequestMethod.GET)
    public String course(Model model)
    {
    model.addAttribute("course", new Course());	
    return "course";
    }
    @RequestMapping(value="/addCourse",method = RequestMethod.POST)
    public String addCourse( @ModelAttribute("course") @Valid Course course,BindingResult result,Model model,HttpSession session)
    {
    	if(result.hasErrors())
    	{
    		return "course";
    	}
    	else
    	{
    	int no = adminservices.createCourse(course);
    	if(no>0)
    	{
    	String message="Course Added Successfully";
    	model.addAttribute("message", message);
    	model.addAttribute("username", (String)session.getAttribute("username"));
    	return "adminhome";
    	}
    	else
    	{
    		String message="Course  Not Added ";
        	model.addAttribute("message", message);
        	return "adminhome";
    	}
    	}
    }
    
    @RequestMapping(value="/showCourses",method =RequestMethod.GET)
	public ModelAndView allCourses()
	{
		List<Course> courses = adminservices.getCourses();
		ModelAndView model = new ModelAndView("adminhome");
		model.addObject("lists", courses);
		return model;
		
	}
    @RequestMapping(value="/back",method=RequestMethod.GET)
	public String back()
	{
	return "adminhome";	
	}
    
    
    
    
}
