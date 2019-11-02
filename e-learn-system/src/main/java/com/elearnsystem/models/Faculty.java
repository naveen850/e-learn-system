package com.elearnsystem.models;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.persistence.TableGenerator;

	import org.hibernate.annotations.GeneratorType;

	@Entity
	@Table(name="Faculty")
	public class Faculty {
		
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="Name")
	private String name;
	@Column(name="Email")
	private String email;
	@Column(name="MobileNumber")
	private Long mobileNumber;
	@Column(name="Password")
	private String  password;
	@Column(name="DoorNumber")
	private String doorNumber;
	@Column(name="Street")
	private String street;
	@Column(name="Area")
	private String area;
	@Column(name="city")
	private String city;
	@Column(name="State")
	private String state;
	@Column(name="PinCode")
	private Long pincode;
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
	public Long getMobileNumber() {
	return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
	this.mobileNumber = mobileNumber;
	}
	public String getPassword() {
	return password;
	}
	public void setPassword(String password) {
	this.password = password;
	}
	@Override
	public String toString() {
	return "AddFaculty [id=" + id + ", name=" + name + ", email=" + email + ", mobileNumber=" + mobileNumber
	+ ", password=" + password + ", doorNumber=" + doorNumber + ", street=" + street + ", area=" + area
	+ ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}

  
	
}
