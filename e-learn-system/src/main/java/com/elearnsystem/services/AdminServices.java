package com.elearnsystem.services;

import java.util.List;

import com.elearnsystem.models.Course;
import com.elearnsystem.models.Student;


public interface AdminServices {
	public int createCourse(Course course);
	public List<Course> getCourses();
	public boolean editCourse(Integer courseId);
	public boolean deleteCourse(Integer courseId);
	public List<Student> listStudents();
	

}
