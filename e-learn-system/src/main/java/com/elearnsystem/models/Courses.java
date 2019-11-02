package com.elearnsystem.models;

import java.io.InputStream;
import java.util.Arrays;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import com.mysql.cj.jdbc.Blob;
@Entity
@Table(name = "courses")
public class Courses {
	@Id
	@Generated("assigned")
	String course;
	
	@Column(name = "file")
	@Lob
	byte[] file;
	public Courses() {
		super();
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public byte[] getFile() {
		return file;
	}
	public void setFile(byte[] file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return "Courses [course=" + course + ", file=" + file + "]";
	}
	
	
	

}
