package com.abhi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.abhi.dto.UserDTO;

public class DataAccessObject {
	private static final String LOGIN_QUERY = "SELECT COUNT(*) FROM BUILD_USER_REGISTER WHERE FIRSTNAME=? AND PASSWORD=? ";
	private static final String REGISTER_QUERY = "INSERT INTO BUILD_USER_REGISTER(FIRSTNAME,LASTNAME,PASSWORD,MOBILENO,EMAIL,ADDRESS,GENDER,IMAGE)VALUES(?,?,?,?,?,?,?,?)";
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	int count = 0;
	int result = 0;

	public int UserLoginByParameters(String firstName, String password) throws Exception {
		System.out.println("DataAccessObject.UserLoginByParameters()");
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
			ps = con.prepareStatement(LOGIN_QUERY);
			ps.setString(1, firstName);
			ps.setString(2, password);
			rs=ps.executeQuery();
			if (rs.next())
				count = rs.getInt(1);
			System.out.println(count);
			if (count == 0) {
				return count;
			} else
				return count;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}//

	public int UserRegisterDAO(UserDTO dto) throws Exception {

		try {
			System.out.println("DataAccessObject.UserRegisterDAO()");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
			ps = con.prepareStatement(REGISTER_QUERY);
			System.out.println(dto.getFirstName());
			System.out.println(dto.getAddress());
			System.out.println(dto.getGender());
			ps.setString(1, dto.getFirstName());
			ps.setString(2, dto.getLastName());
			ps.setString(3, dto.getPassword());
			ps.setString(4, dto.getMobileNo());
			ps.setString(5, dto.getEmail());
			ps.setString(6, dto.getAddress());
			ps.setString(7, dto.getGender());
			ps.setString(8, dto.getImage());
			result = ps.executeUpdate();
			if (result > 0) {
				return result;
			} else {
				return result;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

}// class
