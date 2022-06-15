package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SQLExample {

	public static void main(String[] args) throws Exception {
		//1.JDBC Driver 로딩하기
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2.DB 서버 접속하기
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String pwd = "hr";

		Connection con = DriverManager.getConnection(url, id, pwd);
		
		//3.CRUD 실행
		
		//sql문 반복
		//***INSERT***
		//-1.Statement or PrepareStatement 객체 생성하기
		//물음표를 이용해서 SQL문의 포맷을 만들어줌
		String insert = "INSERT INTO employees VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		//11개 사용
		PreparedStatement pstmt = con.prepareStatement(insert);
		//-2.SQL 구성 후 실행
		pstmt.setInt(1, 1000);
		pstmt.setString(2, "Kil-Dong");
		pstmt.setString(3, "Hong");
		pstmt.setString(4, "kdHong@google.com");
		pstmt.setString(5, "82.10.1234.1234");
		pstmt.setString(6, "21/11/05");
		pstmt.setString(7, "SA_REP");
		pstmt.setInt(8, 6000);
		pstmt.setDouble(9, 0.15);
		pstmt.setInt(10, 149);
		pstmt.setInt(11, 80);
		//~테이블에 있는 타입에 맞춰서 입력해야함~
		//set 메소드를 통해 물음표를 대체 시킴 
		//set 메소드 11번 사용
		//Insert sql문 안에 1번째 물음표를 1000으로 대체함
		//-3.결과 출력
		int result = pstmt.executeUpdate();
		System.out.println("insert 결과 : " + result);
		//insert실행 결과
		
		//***UPDATE***
		//-1.Statement or PrepareStatement 객체 생성하기
		String update = "UPDATE employees SET last_name = ? WHERE employee_id = ?";
		pstmt = con.prepareStatement(update);
		//컬럼이랑 테이블명에는 물음표 x 값으로 들어가는 위치에 
		//컬럼명이나 테이블명 바꾸려고할때는 prepareStatement사용(값 자체를 다루기엔 편리) x -> statement사용해야함
		//-2.SQL 구성 후 실행
		//set은 물음표순서대로 할 필요 x
		pstmt.setInt(2, 1000);
		pstmt.setString(1, "Kang");
		//-3.결과 출력
		result = pstmt.executeUpdate();
		System.out.println("Update 결과 : " + result);
		
		//***SELECT***
		//-1.Statement or PrepareStatement 객체 생성하기
		String select = "SELECT * FROM employees ORDER BY employee_id";
		pstmt = con.prepareStatement(select);
		
		//-2.SQL 구성 후 실행
		ResultSet rs = pstmt.executeQuery();
		
		//-3.결과 출력
		while(rs.next()) {
			String info = rs.getInt("employee_id") + " : " + rs.getString("first_name");
			System.out.println(info);
		}
		
		//***DELETE***
	    //-1.Statement or PrepareStatement 객체 생성하기
		String delete = "DELETE FROM employees WHERE employee_id = ?";
		pstmt = con.prepareStatement(delete);
		
		//-2.SQL 구성 후 실행
		pstmt.setInt(1, 1000);
		
		//-3.결과 출력
		result = pstmt.executeUpdate();
		System.out.println("Delete 결과 : " + result);
		
		//4.자원해제
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		if(con != null) con.close();
	}

}
