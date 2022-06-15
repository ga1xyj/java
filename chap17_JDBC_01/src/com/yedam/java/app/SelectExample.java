package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectExample {

	public static void main(String[] args) throws Exception {
		//1.JDBC Driver 로딩하기
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2.DB 서버 접속하기
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String pwd = "hr";
		Connection con = DriverManager.getConnection(url, id, pwd);
		
		//3.Statement or PreparedStatement 객체 생성하기
		Statement stmt = con.createStatement();
		//온전하게 문장으로 되어있는 sql문 요구
		//SELECT할때 간단할때 사용 INSERT할때는 X
		
		//4.Query 구성 
		String sql = "SELECT * FROM employees"; //세미콜론 없음
		//String sql = "SELECT * FROM employees WEHRE last_name = King"; // 오류 생김
		//String sql = "SELECT * FROM employees WEHRE last_name = 'King'";
		//컬럼이 별로 없다면 숫자로도 가능

		//5.Query 실행
		ResultSet rs = stmt.executeQuery(sql);
		//커서를 움직임 
		//끝에 도달하면 커서를 반환
		//6.결과값을 출력하기
		while(rs.next()) {
			String name = rs.getString("first_name") + " " + rs.getString("last_name");
			System.out.println(name);
		}
		//get이라는 메소드 이용해서 두가지 정보를 사용 -> 매개변수로 컬럼명 사용 , 반환하는 타입 지정
		//셀렉트 절에 있는 순서대로 컬럼 가져옴 (컬럼명 써주는게 좋음)
		//개별적으로 가져옴
		//데이터가 다 출력되면
		
		//해제하는 순서는 생성된 순서의 역순
		//7.자원해제하기 
		if(rs!=null) rs.close();
		if(stmt!=null) stmt.close();
		if(con!=null) con.close();
		
		
	}

}
