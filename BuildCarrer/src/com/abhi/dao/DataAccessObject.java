package com.abhi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.abhi.dto.CompanyBean;
import com.abhi.dto.UserDTO;

public class DataAccessObject {
	private static final String LOGIN_QUERY = "SELECT COUNT(*) FROM BUILD_USER_REGISTER WHERE FIRSTNAME=? AND PASSWORD=? ";
	private static final String REGISTER_QUERY = "INSERT INTO BUILD_USER_REGISTER(FIRSTNAME,LASTNAME,PASSWORD,MOBILENO,EMAIL,ADDRESS,GENDER,IMAGE)VALUES(?,?,?,?,?,?,?,?)";
	private static final String GET_ALL_USERS_QUERY = "SELECT * FROM BUILD_USER_REGISTER WHERE USERNAME=?";
	private static final String COMPANY_REGISTER_QUERY = "INSERT INTO BUILD_COMPANY_REGISTER(COMPANYNAME,PASSWORD,MOBILENO,EMAIL,ADDRESS)VALUES(?,?,?,?,?)";
	private static final String COMPANY_LOGIN_QUERY = "SELECT COUNT(*) FROM BUILD_COMPANY_REGISTER WHERE COMPANYNAME =? AND PASSWORD=?";
	String jdbcURL="jdbc:oracle:thin:@localhost:1521:xe";
	String jdbcUsername="system";
	String jdbcPassword="root";
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	int count = 0;
	int result = 0;

	public int UserLoginByParameters(String firstName, String password) throws Exception {
		System.out.println("DataAccessObject.UserLoginByParameters()");
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
			ps = con.prepareStatement(LOGIN_QUERY);
			ps.setString(1, firstName);
			ps.setString(2, password);
			rs = ps.executeQuery();
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
			con = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
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

	public UserDTO GetUsersDAO(String firstName) throws Exception {
       UserDTO dto=new UserDTO();
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
			ps = con.prepareStatement(GET_ALL_USERS_QUERY);
			ps.setString(1, firstName);
			rs = ps.executeQuery();
			while (rs.next()) {
			dto.setFirstName(rs.getString(1));
			dto.setLastName(rs.getString(2));
			dto.setPassword(rs.getString(3));
			dto.setMobileNo(rs.getString(4));
			dto.setEmail(rs.getString(5));
			dto.setAddress(rs.getString(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}

	public int CompanyRegisterDAO(CompanyBean bean) throws Exception {

		try {
			System.out.println("DataAccessObject.UserRegisterDAO()");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
			ps = con.prepareStatement(COMPANY_REGISTER_QUERY);
			ps.setString(1, bean.getCompanyName());
			ps.setString(2, bean.getPassword());
			ps.setString(3, bean.getMobileNo());
			ps.setString(4, bean.getEmail());
			ps.setString(5, bean.getAddress());
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

	public int CompanyLoginDAO(String companyName, String password)throws Exception {
		try {
			System.out.println("DataAccessObject.UserRegisterDAO()");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
			ps = con.prepareStatement(COMPANY_LOGIN_QUERY);
			ps.setString(1, companyName);
			ps.setString(2, password);
			rs=ps.executeQuery();
			if(rs.next())
				count=rs.getInt(1);
              if(count==0) {
            	  return count;
              }
              else {
            	return count;  
              }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}// class
