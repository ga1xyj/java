package com.yedam.java.de;

import java.util.List;
import java.util.Scanner;

public class DeSystem {
	private DeDAO dao = DeDAO.getInstance();
	private Scanner sc = new Scanner(System.in);
	
	public DeSystem() {
		while(true) {
			menuPrint();
			int menuNo = selectMenu();
			if(menuNo == 1) {
				insertDepartment();
			}else if (menuNo == 2) {
				updateDepartment();
			}else if (menuNo == 3) {
				deleteDepartment();
			}else if (menuNo == 4) {
				selectDepartment();
			}else if (menuNo == 5) {
				selectAllDepartment();
			}else if (menuNo == 9) {
				exit();
				break;
			}else {
				inputError();
			}
		}
	}
	
	private void menuPrint() {
		System.out.println("*****************************************************");
		System.out.println(" 1.등록 | 2.수정 | 3.삭제 | 4.부서조회 | 5.전체조회 | 9.종료 ");
		System.out.println("*****************************************************");

	}
	
	private int selectMenu() {
		int menu = 0;
		try {
			menu = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력해주세요.");
		}
		return menu;
	}
	
	private void exit() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	private void inputError() {
		System.out.println("메뉴에 맞게 입력해주세요.");
	}
	
	private void insertDepartment() {
		Departments de = inputAll();
		dao.insert(de);
	}
	
	private void updateDepartment() {
		Departments de = inputUpdateInfo();
		dao.update(de);
	}
	
	private void deleteDepartment() {
		int departmentId = inputDepartmentId();
		dao.delete(departmentId);
	}
	
	private void selectDepartment() {
		int departmentId = inputDepartmentId();
		Departments de = dao.selectOne(departmentId);
		if(de != null) {
			System.out.println(de);
		}else {
			System.out.println("원하는 정보가 존재하지 않습니다.");
		}
	}
	
	private void selectAllDepartment() {
		List<Departments> list = dao.selectAll();
		for(Departments de : list) {
			System.out.println(de);
		}
	}
	
	private Departments inputAll() {
		Departments de = new Departments();
		System.out.print("부서번호>>");
		de.setDepartmentId(Integer.parseInt(sc.nextLine()));
		System.out.print("부서명>>");
		de.setDepartmentName(sc.nextLine());
		System.out.print("상사번호>>");
		de.setManagerId(Integer.parseInt(sc.nextLine()));
		System.out.print("위치번호>>");
		de.setLocationId(Integer.parseInt(sc.nextLine()));
		return de;
	}
	
	private Departments inputUpdateInfo() {
		Departments de = new Departments();
		System.out.print("부서번호>>");
		de.setDepartmentId(Integer.parseInt(sc.nextLine()));
		System.out.print("위치번호>>");
		de.setLocationId(Integer.parseInt(sc.nextLine()));
		return de;
	}
	
	private int inputDepartmentId() {
		System.out.print("부서번호>>");
		return Integer.parseInt(sc.nextLine());
	}
}
