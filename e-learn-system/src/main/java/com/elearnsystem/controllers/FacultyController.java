package com.elearnsystem.controllers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import javax.validation.Valid;

import org.apache.commons.io.IOUtils;
import org.apache.tomcat.util.http.fileupload.UploadContext;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.elearnsystem.daos.CoursesRepository;
import com.elearnsystem.models.Courses;
import com.elearnsystem.models.Faculty;

@Controller
public class FacultyController{
	@Autowired
	CoursesRepository repository;
	@RequestMapping(value = "/faculty",method = RequestMethod.GET)
	public String facultyLogin(Model model) {
	    Faculty faculty= new Faculty();
		model.addAttribute(faculty);
		return "facultylogin";
	}
	@RequestMapping(value = "/facultyLogin",method = RequestMethod.POST)
	public String viewFaculty(Model model)
	{
	
		
	return "facultyservices";
	}

	
	@RequestMapping(value="/addvideo", method = RequestMethod.GET)
	public String addVideo(Model model)
	{
		Courses course= new Courses();
		model.addAttribute("course",course);
		return "addvideo";
	}
	
	  @RequestMapping(value = "/add", method = RequestMethod.POST)
	public String video(@ModelAttribute("course") @Valid Courses course, BindingResult result,@RequestParam("file1") MultipartFile file,Model model) throws IOException, ServletException
	{  
		  
		    
		    course.setFile(IOUtils.toByteArray(file.getInputStream()));  
		  


		   repository.save(course);
		  		 
		
		 return "facultyservices";
	}
}
