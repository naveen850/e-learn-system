package com.elearnsystem.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elearnsystem.daos.CourseRepository;
import com.elearnsystem.models.Admin;
import com.elearnsystem.models.Faculty;
import com.elearnsystem.models.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.elearnsystem.models.Course;
import com.elearnsystem.services.AdminServices;
import com.elearnsystem.services.AdminServicesImpl;
@Controller
public class AdminController {
	@Autowired
	AdminServicesImpl adminServices;
	
	 @RequestMapping(value = "/admin",method = RequestMethod.GET)
	public String adminLogin(Model model)
	{
		 Admin admin=new Admin();
		 model.addAttribute(admin);
		return "adminlogin";
	}
	 @RequestMapping(value = "/login",method = RequestMethod.POST)
	 public String login(@ModelAttribute("admin") Admin admin,Model model)
	 {
		 return "adminservices";
	 }
	  @RequestMapping(value = "viewstudents",method = RequestMethod.GET)
	 public String  viewStudents(Model model)
	 {
		  List<Student> list=adminServices.listStudents();
		  model.addAttribute("list",list);
		  
		 return "viewstudents";
	 }
	
    @RequestMapping(value="addcourse",method=RequestMethod.GET)
    public String course(Model model)
    {
    	Course course=new Course();
    model.addAttribute(course);	
    return "addcourse";
    }
    @RequestMapping(value="addcourse",method = RequestMethod.POST)
    public String addCourse( @ModelAttribute("course") @Valid Course course,BindingResult result,Model model,HttpSession session)
    {
    	if(result.hasErrors())
    	{
    		return "addcourse";
    	}
    	else
    	{
    	int no = adminServices.createCourse(course);
    	if(no>0)
    	{
    	String message="Course Added Successfully";
    	model.addAttribute("message", message);
    	model.addAttribute("username", (String)session.getAttribute("username"));
    	return "addcourse";
    	}
    	else
    	{
    		String message="Course  Not Added ";
        	model.addAttribute("message", message);
        	return "addcourse";
    	}
    	}
    }
    
    @RequestMapping(value="addfaculty",method=RequestMethod.GET)
    public String faculty(Model model)
    {
    Faculty faculty=new Faculty();
    model.addAttribute(faculty);	
    return "addfaculty";
    }
    
    @RequestMapping(value = "addfaculty",method = RequestMethod.POST)
    public String addFaculty(@ModelAttribute("faculty")Faculty faculty,Model model)
    {
    	    adminServices.addFaculty(faculty);
    	    String message="Added Successfully";
    	    model.addAttribute("message", message);
    	    model.addAttribute(new Faculty());
    	return "adminservices";
    }
    
    @RequestMapping(value="/showCourses",method =RequestMethod.GET)
	public ModelAndView allCourses()
	{
		List<Course> courses =adminServices.getCourses();
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
