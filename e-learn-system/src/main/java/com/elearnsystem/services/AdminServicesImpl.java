package com.elearnsystem.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.elearnsystem.daos.CourseRepository;
import com.elearnsystem.daos.FacultyRepository;
import com.elearnsystem.daos.StudentRepository;
import com.elearnsystem.models.Course;
import com.elearnsystem.models.Faculty;
import com.elearnsystem.models.Student;

@Component
public class AdminServicesImpl implements AdminServices {
    @Autowired
	private CourseRepository courseRepository;
    @Autowired 
    StudentRepository student;
    @Autowired
    FacultyRepository facultyRepository;
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
		
		Iterator<Student> iterable=student.findAll().iterator();
		List<Student> list=new ArrayList<Student>();
		while(iterable.hasNext())
		{
			list.add(iterable.next());
		}
		
		return list;
	}

	@Override
	public int addFaculty(Faculty faculty) {
	     Faculty f=facultyRepository.save(faculty);
		return f.getId();
	}

	
}
