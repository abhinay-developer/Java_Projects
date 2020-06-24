package com.careers.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {
	private int userId;
	private String firstName;
	private String lastName;
	private String  password;
	private String email;
	private int mobileNo;
	private String address;
	private String gender;
	private String uploadResume;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUploadResume() {
		return uploadResume;
	}
	public void setUploadResume(String uploadResume) {
		this.uploadResume = uploadResume;
	}
	
	
}
