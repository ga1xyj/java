package com.yedam.java.emp;

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

public class EmpDAO {
	// DB에 접근하는 클래스
	// 싱글톤
	// 관리를 편하게 하기 위해
	// DB에 있는 데이터 -> 프로그램에 전달
	
	//static은 프로그램 시작할 때 초기화됨
	private static EmpDAO empDAO = null;

	private EmpDAO() {
	}
	//호출되는 순간에 new 연산자로 인스턴스 만들어짐
	//내가 사용하는 시점에 인스턴스를 생성하겠다
	public static EmpDAO getInstance() {
		if (empDAO == null) {
			empDAO = new EmpDAO();
		}
		return empDAO;
		//인스턴스 생성했으면 empDAO 리턴
	}

	// Oracle 연결 정보
	String jdbc_driver;
	String oracle_url;
	String id;
	String connectedId;
	String connectedPwd;

	// 각 메소드에서 공통적으로 사용하는 필드
	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;

	// 메소드로 분리 시켜줌

	public void connect() {
		// 꼭 필요한 건 아님
		dbConfig();
		try {
			// 1.JDBC Driver 로딩
			Class.forName(jdbc_driver);
			// 2.DB 서버 접속
			conn = DriverManager.getConnection(oracle_url, connectedId, connectedPwd);
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC Driver 로딩실패");
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
		}
	}
	// 3.CRUD 실행
	// 전체조회
	public List<Employees> selectAll() {
		List<Employees> list = new ArrayList<>();
		//sql문이라 try-catch 구문
		try {
			connect(); //DB와 연결
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM employees ORDER BY employee_id");
			while(rs.next()) {
				Employees emp = new Employees();
				//setter를 통해 값 집어넣기
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("Last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHire_Date(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setCommisionPct(rs.getDouble("commission_pct"));
				emp.setManagerId(rs.getInt("manager_id"));
				emp.setDepartmentId(rs.getInt("department_id"));
				
				list.add(emp);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect(); //DB와 연결 종료
		}
		return list;
		//타입에 대응되는 변수 선언 & 리턴
	}
	// 단건조회
	//기본키 이용
	public Employees selectOne(int employeeId) {
		Employees emp = null; //null로 초기화
		try {
			connect();
			String sql = "SELECT * FROM employees WHERE employee_id =" + employeeId;
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				emp = new Employees(); //인스턴스 생성
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("Last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHire_Date(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setCommisionPct(rs.getDouble("commission_pct"));
				emp.setManagerId(rs.getInt("manager_id"));
				emp.setDepartmentId(rs.getInt("department_id"));
			}
		}catch(SQLException e) {
			e.printStackTrace(); //비워두면 안됨
		}finally{
			disconnect();
		}
		return emp;
	}
	// 등록
	public void insert(Employees emp) {
		try {
			connect();
			String sql = "INSERT INTO employees VALUES (?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(2, emp.getFirstName());
			pstmt.setString(3, emp.getLastName());
			pstmt.setString(4, emp.getEmail());
			pstmt.setString(5, emp.getPhoneNumber());
			pstmt.setDate(6, emp.getHire_Date());
			pstmt.setString(7, emp.getJobId());
			pstmt.setDouble(8, emp.getSalary());
			pstmt.setDouble(9, emp.getCommisionPct());
			pstmt.setInt(10, emp.getManagerId());
			pstmt.setInt(11, emp.getDepartmentId());
			
			int result = pstmt.executeUpdate(); //db쪽으로 쿼리 넘겨줌
			
			if(result > 0) {
				System.out.println("등록이 완료되었습니다.");
			}else {
				System.out.println("등록되지 않았습니다.");
			}
			
			System.out.println(result + "건이 완료되었습니다.");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	// 수정
	// 연봉
	public void update(Employees emp) {
		try {
			connect();
			String sql = "UPDATE employees SET salary = ? WHERE employee_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(2, emp.getEmployeeId());
			pstmt.setDouble(1, emp.getSalary());
			
			int result = pstmt.executeUpdate(); //db쪽으로 쿼리 넘겨줌
			
			if(result > 0) {
				System.out.println("수정이 완료되었습니다.");
			}else {
				System.out.println("수정되지 않았습니다.");
			}
			System.out.println(result + "건이 완료되었습니다.");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	// 삭제
	public void delete(int employeeId) {
		try {
			connect();
			String sql = "DELETE FROM employees WHERE employee_id =" + employeeId;
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result > 0) {
				System.out.println("정상적으로 삭제되었습니다.");
			}else {
				System.out.println("정상적으로 삭제되지 않았습니다.");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	
	// 4.자원 해제
	public void disconnect() {
		// null값인지 아닌지 물어주기
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

	private void dbConfig() {
		String resource = "config/db.properties";
		Properties properties = new Properties();

		// 경로가 정확하지 않으면 classloader를 통해 찾는다
		try {
			String filePath = ClassLoader.getSystemClassLoader().getResource(resource).getPath();
			properties.load(new FileInputStream(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 수정도 가능
		jdbc_driver = properties.getProperty("driver");
		oracle_url = properties.getProperty("url");
		connectedId = properties.getProperty("id");
		connectedPwd = properties.getProperty("password");

	}

}
