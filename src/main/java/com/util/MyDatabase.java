package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Student;

public class MyDatabase {

	public static Connection myConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap76", "root", "root");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static List<Student> studentRowMapper(ResultSet rs) throws SQLException{
		List<Student> list = new ArrayList();
		while(rs.next()) {
			Student s = new Student();
			s.setId(rs.getInt("id"));
			s.setName(rs.getString("name"));
			s.setCity(rs.getString("city"));
			s.setPercentage(rs.getDouble("percentage"));
			list.add(s);
		} rs.close();
		return list;
	}
}
