package com.yedam.java.emp;

import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		List<Employees> list = EmpDAO.getInstance().selectAll();
		for(Employees emp : list) {
			System.out.println(emp);
		}
	}

}
