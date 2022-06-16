package com.yedam.java.de;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DeDAO {
	private static DeDAO deDAO = null;

	private DeDAO() {
	}

	public static DeDAO getInstance() {
		if (deDAO == null) {
			deDAO = new DeDAO();
		}
		return deDAO;
	}

	String jdbcDriver;
	String oracleUrl;
	String id;
	String connectedId;
	String connectedPwd;

	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;

	public void connect() {
		dbConfig();
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(oracleUrl, connectedId, connectedPwd);
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC Driver 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
		}
	}

	private void dbConfig() {
		String resource = "config/db.properties";
		Properties properties = new Properties();
		try {
			String filePath = ClassLoader.getSystemClassLoader().getResource(resource).getPath();
			properties.load(new FileInputStream(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		jdbcDriver = properties.getProperty("driver");
		oracleUrl = properties.getProperty("url");
		connectedId = properties.getProperty("id");
		connectedPwd = properties.getProperty("password");
	}

	public void disconnect() {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Departments> selectAll() {
		List<Departments> list = new ArrayList<>();
		try {
			connect();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM departments ORDER BY department_id");
			while (rs.next()) {
				Departments de = new Departments();
				de.setDepartmentId(rs.getInt("department_id"));
				de.setDepartmentName(rs.getString("department_name"));
				de.setManagerId(rs.getInt("manager_id"));
				de.setLocationId(rs.getInt("location_id"));
				list.add(de);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
	
	public Departments selectOne(int departmentId) {
		Departments de = null;
		try {
			connect();
			String sql = "SELECT * FROM departments WHERE department_id =" + departmentId;
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				de = new Departments();
				de.setDepartmentId(rs.getInt("department_id"));
				de.setDepartmentName(rs.getString("department_name"));
				de.setManagerId(rs.getInt("manager_id"));
				de.setLocationId(rs.getInt("location_id"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return de;
	}
	
	public void insert(Departments de) {
		try {
			connect();
			String sql = "INSERT INTO departments VALUES(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, de.getDepartmentId());
			pstmt.setString(2, de.getDepartmentName());
			pstmt.setInt(3, de.getManagerId());
			pstmt.setInt(4, de.getLocationId());
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("등록이 완료되었습니다.");
			}else {
				System.out.println("등록되지 않았습니다");
			}
			System.out.println(result + "건이 완료되었습니다");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	
	public void update(Departments de) {
		try {
			connect();
			String sql = "UPDATE departments SET location_id = ? WHERE department_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, de.getLocationId());
			pstmt.setInt(2, de.getDepartmentId());
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("수정이 완료되었습니다.");
			}else {
				System.out.println("수정되지 않았습니다.");
			}
			System.out.println(result + "건이 완료되었습니다.");
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	
	public void delete(int departmentId) {
		try {
			connect();
			String sql = "DELETE FROM departments WHERE department_id =" + departmentId;
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result > 0) {
				System.out.println("정상적으로 삭제되었습니다.");
			}else {
				System.out.println("정상적으로 삭제되지 않았습니다.");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	
	
	
}
