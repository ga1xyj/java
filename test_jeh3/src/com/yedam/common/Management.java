package com.yedam.common;

import java.util.List;
import java.util.Scanner;

import com.yedam.books.Book;
import com.yedam.books.BookDAO;

public class Management {
	protected Scanner sc = new Scanner(System.in);
	protected BookDAO bDAO = BookDAO.getInstance();

	public void run() {
		while (true) {
			menuPrint();
			int menuNo = menuSelect();
			if (menuNo == 1) {
				// 전체조회
				selectAll();
			} else if (menuNo == 2) {
				// 단건조회
				selectOne();
			} else if (menuNo == 3) {
				// 내용검색
				selectContent();
			} else if (menuNo == 4) {
				// 대여가능
				selectRental();
			} else if (menuNo == 5) {
				// 책 대여
				Rental();
			} else if (menuNo == 6) {
				// 책 반납
				Return();
			} else if (menuNo == 7) {
				// 책 등록
				insertBookInfo();
			} else if (menuNo == 9) {
				// 종료
				exit();
				break;
			} else {
				showInputError();
			}
		}
	}

	private void menuPrint() {
		System.out.println("=================================================================================");
		System.out.println("1.전체조회 | 2.단건조회 | 3.내용검색 | 4.대여가능 | 5.책 대여 | 6.책 반납 | 7.책 등록 | 9.종료");
		System.out.println("=================================================================================");
	}

	private int menuSelect() {
		int menuNo = 0;
		try {
			System.out.print("메뉴선택>");
			menuNo = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력해주시기 바랍니다.");
		}
		return menuNo;
	}

	private void exit() {
		System.out.println("프로그램이 종료되었습니다.");
	}

	private void showInputError() {
		System.out.println("메뉴에서 입력해주시기 바랍니다.");
	}

	private void selectAll() {
		List<Book> list = bDAO.selectAll();
		for (Book book : list) {
			System.out.println(book);
		}
	}

	private void selectOne() {
		String bookName = inputName();
		Book book = bDAO.selectOne(bookName);
		if (book == null) {
			System.out.println("등록된 책이 아닙니다.");
			return;
		}
		System.out.println(book);
	}

	private String inputName() {
		System.out.print("책제목>");
		return sc.nextLine();
	}

	private void selectContent() {
		String bookContent = inputContent();
		if(bookContent == null) {
			System.out.println("검색 가능한 책이 없습니다.");
			return;
		}
		List<Book> list = bDAO.selectContent(bookContent);
		for (Book book : list)
			System.out.println(book);
	}


	private String inputContent() {
		System.out.print("검색내용>");
		return sc.nextLine();
	}

	private void insertBookInfo() {
		Book book = inputAll();
		bDAO.insert(book);
	}

	private Book inputAll() {
		Book book = new Book();
		System.out.print("책제목>");
		book.setBookName(sc.nextLine());
		System.out.print("저자명>");
		book.setBookWriter(sc.nextLine());
		System.out.print("내용>");
		book.setBookContent(sc.nextLine());
		return book;
	}

	private void selectRental() {
		List<Book> list = bDAO.selectRental();
		for (Book book : list) {
			System.out.println(book);
		}
	}

	private void Rental() {
		String bookName = inputName();
		Book book = bDAO.selectOne(bookName);
		if (book == null) {
			System.out.println("해당 책이 없습니다.");
			return;
		}
		if (book.getBookRental() == 0) {
			bDAO.updateRental(book);
			System.out.println("대여되었습니다.");
		} else {
			System.out.println("대여할 수 없습니다.");
		}
	}

	private void Return() {
		String bookName = inputName();
		Book book = bDAO.selectOne(bookName);
		if (book == null) {
			System.out.println("해당 책이 없습니다.");
			return;
		}
		if (book.getBookRental() == 1) {
			bDAO.updateReturn(book);
			System.out.println("반납하였습니다.");
		} else {
			System.out.println("반납할 수 없습니다.");
		}
	}
}
