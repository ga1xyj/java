package com.yedam.java.example1;

import java.util.Scanner;

public class CustomerSystem {
	// 필드
	private Repo repo = new Repo(); // 저장소 생성
	private Scanner sc = new Scanner(System.in);

	// 생성자
	public CustomerSystem() {
		while (true) {
			// 메뉴 출력
			menuPrint();
			// 메뉴 선택
			int menuNo = menuSelect();
			// 각 메뉴에 대해 실행
			if (menuNo == 1) {
				// 메뉴1 - 회원가입
				signUp();
			} else if (menuNo == 2) {
				// 메뉴2 - 회원정보
				myPage();
			} else if (menuNo == 3) {
				// 메뉴3 - 결제시 금액
				payInfo();
			} else if (menuNo == 4) {
				// 메뉴4 - 종료
				exit();
				break;
			}
		}
	}

	// 메소드
	void menuPrint() {
		System.out.println("======================================");
		System.out.println("1.회원가입 | 2.회원정보 | 3.결제금액 | 4.종료");
		System.out.println("======================================");
	}

	int menuSelect() {
		System.out.print("메뉴> ");
		return sc.nextInt();
	}

	void myPage() {
		int customerId = inputOne();
		Customer info = repo.selectOne(customerId);
		System.out.println(info.showInfo());
	}

	void payInfo() {
		int customerId = inputOne();
		Customer info = repo.selectOne(customerId);

		System.out.print("구매 금액> ");
		int price = sc.nextInt();
		int pay = info.calPrice(price);
		System.out.println("결제 금액: " + pay);
	}

	void exit() {
		System.out.println("프로그램 종료");
	}

	int inputOne() {
		System.out.print("고객 아이디> ");
		return sc.nextInt();
	}

	void signUp() {
		// 회원 정보 입력
		Customer info = inputAll();
		// 가입
		repo.insert(info);
	}

	Customer inputAll() {
		//회원 기보 정보 입력
		int selected = selectGrade();
		System.out.print("아이디> ");
		int id = sc.nextInt();
		System.out.print("이름> ");
		String name = sc.next();

		Customer customer = null;
		switch (selected) {
		case 1:
			customer = new Customer(id, name);
			break;
		case 2:
			customer = new Gold(id, name);
			break;
		case 3:
			customer = new VIP(id, name, "주은하");
			break;
		}
		return customer;
	}

	int selectGrade() {
		System.out.println("1.SILVER | 2.GOLD | 3.VIP");
		System.out.println("-------------------------");
		System.out.print("선택 >");
		return sc.nextInt();
	}
}