package com.abhi.service;

import com.abhi.dao.DataAccessObject;
import com.abhi.dto.CompanyBean;
import com.abhi.dto.UserDTO;

public class Service {
	private DataAccessObject dao;

	public int UserLogin(String firstName, String password) throws Exception {
		dao = new DataAccessObject();
		return dao.UserLoginByParameters(firstName, password);

	}

	public int UserRegisterService(UserDTO dto) throws Exception {
		System.out.println("Service.UserRegisterService()");
		dao = new DataAccessObject();
		return dao.UserRegisterDAO(dto);
	}

	public UserDTO GetUsers(String firstName) throws Exception {
		System.out.println("Service.GetUSers()");
		dao = new DataAccessObject();
		return dao.GetUsersDAO(firstName);

	}

	public int CompanyRegisterService(CompanyBean bean) throws Exception {
		System.out.println("Service.CompanyRegisterService()");
		dao=new DataAccessObject();
		return dao.CompanyRegisterDAO(bean);
		
	}
	public int CompanyLoginService(String companyName,String password)throws Exception {
		System.out.println("Service.CompanyLoginService()");
		dao=new DataAccessObject();
		return dao.CompanyLoginDAO(companyName, password);
	}
}