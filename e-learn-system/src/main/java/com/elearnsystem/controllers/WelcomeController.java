package com.elearnsystem.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elearnsystem.daos.CourseRepository;
import com.elearnsystem.daos.StudentRepository;
import com.elearnsystem.models.Course;

@Controller
public class WelcomeController {
	@Autowired
	CourseRepository course;
	@RequestMapping(value="/project",method=RequestMethod.GET)
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value = "/viewcourses",method = RequestMethod.GET)
	public String viewCourses(Model model)
	{
		  Iterator<Course> iterableCourse=course.findAll().iterator();
		  List<Course> list=new ArrayList<Course>();
		  while(iterableCourse.hasNext())
		  {
			  list.add(iterableCourse.next());
		  }
		  model.addAttribute("list", list);
		
		return "viewcourses";
	}

}
