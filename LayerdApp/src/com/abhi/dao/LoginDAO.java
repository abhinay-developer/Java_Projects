package com.abhi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.abhi.dto.ProductsDTO;
import com.abhi.dto.RegisterDTO;

public class LoginDAO {
	private static final String ADMIN_LOGIN = "SELECT COUNT(*) FROM ADMIN_LOGIN WHERE USERNAME=? AND PASSWORD=?";
	private static final String REGISTER_QUERY = "INSERT INTO ANQ_REGISTER(USERNAME,PASSWORD,EMAIL,ADDRESS,DOB,GENDER,PICTURE,MOBILENO)VALUES(?,?,?,?,?,?,?,?)";
	private static final String GET_PROFILE_QUERY = "SELECT USERNAME,PASSWORD,EMAIL,ADDRESS,DOB,GENDER,PICTURE,MOBILENO  FROM ANQ_REGISTER WHERE USERNAME=?";
	private static final String ADD_QUERY="INSERT INTO ANQ_ADD_PRODUCTS(HEADING,SEARCHKEYWORD,DESCRIPTION)VALUES(?,?,?)";
	private static final String GET_PRODUCTS_QUERY="SELECT HEADING,SEARCHKEYWORD,DESCRIPTION FROM ANQ_ADD_PRODUCTS WHERE HEADING=?";
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	int count = 0;

	public int CheckUserLoginByParameters(String username, String password) throws Exception {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
			ps = con.prepareStatement(ADMIN_LOGIN);
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if (rs != null) {
				if (rs.next())
					count = rs.getInt(1);
			}
			if (count == 0) {
				return count;

			} else {
				return count;
			}
		}

		catch (Exception e) {

			{
				e.printStackTrace();
			}

		}

		return 0;

	}

	public int RegistrationbyParamametrs(RegisterDTO dto) throws Exception {

		System.out.println(dto.getUsername());
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
			ps = con.prepareStatement(REGISTER_QUERY);
			ps.setString(1, dto.getUsername());
			ps.setString(2, dto.getPassword());
			ps.setString(3, dto.getEmail());
			ps.setString(4, dto.getAddress());
			ps.setString(5, dto.getDateofbirth());
			ps.setString(6, dto.getGender());
			ps.setString(7, dto.getPicture());
			ps.setString(8, dto.getMobileno());

			result = ps.executeUpdate();
			if (result > 0)

				return result;
			else
				return result;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	public RegisterDTO GetProfile(String username ) {
		RegisterDTO dto=new RegisterDTO();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
			ps = con.prepareStatement(GET_PROFILE_QUERY);
			ps.setString(1, username);
			rs = ps.executeQuery();
			if(rs.next())
			{
				dto.setUsername(rs.getString(1));
				dto.setPassword(rs.getString(2));
				dto.setEmail(rs.getString(3));
				dto.setAddress(rs.getString(4));
				dto.setDateofbirth(rs.getString(5));
				dto.setGender(rs.getString(6));
				dto.setPicture(rs.getString(7));
				dto.setMobileno(rs.getString(8));
				
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
		
	}
	public int AddProducts(ProductsDTO pDto)throws Exception
	{
		int result=0;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
			ps = con.prepareStatement(ADD_QUERY);
			ps.setString(1, pDto.getHeading());
			ps.setString(2, pDto.getSearchkeyword());
			ps.setString(3, pDto.getDescription());
			result = ps.executeUpdate();
			if (result > 0)

				return result;
			else
				return result;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
		
	}

	public ProductsDTO GetProducts(String heading) {
	ProductsDTO pdto=new ProductsDTO();
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
		ps = con.prepareStatement(GET_PRODUCTS_QUERY);
        ps.setString(1, pdto.getHeading());
		/*
		 * ps.setString(2, pdto.getSearchkeyword()); ps.setString(3,
		 * pdto.getDescription());
		 */  rs=ps.executeQuery();
        if(rs.next())
        {
	      pdto.setHeading(rs.getString(1));
	      pdto.setSearchkeyword(rs.getString(2));
	      pdto.setDescription(rs.getString(3));
        }        	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return pdto;
}
}