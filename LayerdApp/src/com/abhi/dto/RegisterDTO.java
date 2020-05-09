package com.abhi.dto;

import java.io.Serializable;

public class RegisterDTO implements Serializable {
	
	private String  username;
	private String password;
	private String email; 
	private String address;
	private String dateofbirth;
	private String gender;
	private String picture;
	private String mobileno;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "RegisterDTO [username=" + username + ", password=" + password + ", email=" + email + ", address="
				+ address + ", dateofbirth=" + dateofbirth + ", gender=" + gender + ", picture=" + picture
				+ ", mobileno=" + mobileno + "]";
	}
	
	

}
