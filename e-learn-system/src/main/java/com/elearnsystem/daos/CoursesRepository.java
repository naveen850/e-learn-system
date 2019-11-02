package com.elearnsystem.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.elearnsystem.models.Courses;

public interface CoursesRepository extends CrudRepository<Courses, String> {

}
