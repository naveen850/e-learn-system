package com.elearnsystem.daos;

import org.springframework.data.repository.CrudRepository;

import com.elearnsystem.models.Course;

public interface CourseRepository extends CrudRepository<Course,Integer> {

}
