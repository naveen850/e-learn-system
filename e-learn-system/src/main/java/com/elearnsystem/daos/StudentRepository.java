package com.elearnsystem.daos;

import org.springframework.data.repository.CrudRepository;

import com.elearnsystem.models.Student;

public interface StudentRepository extends CrudRepository<Student,String> {

}
