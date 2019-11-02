package com.elearnsystem.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.elearnsystem.daos.CourseRepository;
import com.elearnsystem.models.Course;
import com.elearnsystem.models.Student;

@Component
public class AdminServicesImpl implements AdminServices {
    @Autowired
	private CourseRepository courseRepository;
	@Override
	public int createCourse(Course course) {

    Course c =courseRepository.save(course);
		return c.getCourseId();
	}

	@Override
	public List<Course> getCourses() {

      List<Course> allcoures = new ArrayList<Course>();
		
	Iterator<Course> courses=	courseRepository.findAll().iterator();
	
	while(courses.hasNext())
	{
		allcoures.add(courses.next());
	}
		return allcoures;
	}

	@Override
	public boolean editCourse(Integer courseId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCourse(Integer courseId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Student> listStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
