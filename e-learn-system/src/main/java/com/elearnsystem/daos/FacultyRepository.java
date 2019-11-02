package com.elearnsystem.daos;

import org.springframework.data.repository.CrudRepository;

import com.elearnsystem.models.Faculty;

public interface FacultyRepository extends CrudRepository<Faculty, String> {

}
