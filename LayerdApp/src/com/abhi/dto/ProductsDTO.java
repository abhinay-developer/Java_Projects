package com.abhi.dto;

import java.io.Serializable;

public class ProductsDTO implements Serializable{

	private String  heading;
	private String  searchkeyword;
	private String  description;
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	public String getSearchkeyword() {
		return searchkeyword;
	}
	public void setSearchkeyword(String searchkeyword) {
		this.searchkeyword = searchkeyword;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
