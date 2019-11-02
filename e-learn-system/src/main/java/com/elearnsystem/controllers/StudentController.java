package com.elearnsystem.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elearnsystem.daos.StudentRepository;
import com.elearnsystem.models.Student;

@Controller
public class StudentController {
	@Autowired
	StudentRepository user;
	@RequestMapping(value="/student",method=RequestMethod.GET)
	public String login(Model model)
	{
		Student student=new Student();
		model.addAttribute(student);
		return "studentlogin";
	}

	@RequestMapping(value="/studentRegister",method=RequestMethod.GET)
public String register(Model model)
{
	Student student=new Student();
	model.addAttribute(student);
	return "studentregister";
}
	@RequestMapping(value="/studentRegister",method=RequestMethod.POST)
	public String addStudent(@ModelAttribute("student")  @Valid Student student,BindingResult result,Model model,HttpSession session)
	{
		if(result.hasErrors())
		{
			return "studentregister";
		}
		else
		{
	user.save(student);
	String message="You Have Successfully Registerd";
	model.addAttribute("message",message);
	
	return "studentlogin";
		}
	}

}
