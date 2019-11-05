  package com.elearnsystem.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	 
	@Column(name="Name")
	@Size(min=1,message="Name is required") 
	private String name;
	
	@Column(name="Email")
	@Size(min=1,message="Email is mandatory") 
	private String email;
	
	@Column(name="mobilenumber")
	@Size(min=1,message="Number is required")
	private String mobileNumber;
	
	@Column(name="Password")
	@Size(min=1,message="Password is required") 
	private String  password;
	
	@Column(name="DoorNumber")
	@Size(min=1,message="DoorNumber")
	private String doorNumber;
	
	@Column(name="Street")
	@Size(min=1,message="Street is required")
	private String street;
	
	@Column(name="Area")
	private String area;
	
	@Column(name="city")
	private String city;
	
	@Column(name="State")
	@Size(min=1,message="State is required")
	private String state;
	
	@Column(name="PinCode")
	
	private Long pincode;
	
	@Column(name="CourseName")
	@Size(min=1,message="Course is required")
		private String courseName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public Student() {
		super();
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", mobileNumber=" + mobileNumber
				+ ", password=" + password + ", doorNumber=" + doorNumber + ", street=" + street + ", area=" + area
				+ ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", courseName=" + courseName + "]";
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	
}