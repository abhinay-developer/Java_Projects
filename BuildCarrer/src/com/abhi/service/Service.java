package com.abhi.service;

import com.abhi.dao.DataAccessObject;
import com.abhi.dto.UserDTO;

public class Service {
	private DataAccessObject dao;

	public int UserLogin(String firstName, String password) throws Exception {
		dao = new DataAccessObject();
		return dao.UserLoginByParameters(firstName, password);

	}
	public int UserRegisterService(UserDTO dto)throws Exception {
		System.out.println("Service.UserRegisterService()");
		dao=new DataAccessObject();
		return dao.UserRegisterDAO(dto);
	}
	
}
