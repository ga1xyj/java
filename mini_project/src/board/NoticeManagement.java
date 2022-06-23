package board;

import java.util.List;

import common.Management;

public class NoticeManagement extends Management {
	private NoticeDAO nDAO = NoticeDAO.getInstance();

	public NoticeManagement() {
		while (true) {
			menuPrint();
			int menuNo = menuSelect();
			if (menuNo == 1) {
				// 조회
				selectAll();
			} else if (menuNo == 2) {
				// 검색
				selectKeyword();
			} else if (menuNo == 3) {
				// 등록
				insertNotice();
			} else if (menuNo == 4) {
				// 수정
				updateNotice();
			} else if (menuNo == 5) {
				// 삭제
				deleteNotice();
			} else if (menuNo == 5) {
				// 뒤로가기
				back();
				break;
			} else {
				showInputError();
			}
		}
	}

	protected void menuPrint() {
		System.out.println("========================================");
		System.out.println(" 1.조회 2.검색 3.등록 4.수정 5.삭제 6.뒤로가기 ");
		System.out.println("========================================");
	}

	private void back() {
		System.out.println("메인으로 돌아갑니다.");
	}

	// 조회
	private void selectAll() {
		List<Notice> list = nDAO.selectAll();
		for (Notice notice : list) {
			System.out.println(notice);
		}
		Click();
	}

	private void Click() {
	}

	// 검색
	private void selectKeyword() {
		String keyword = inputKeyword();
		if (keyword == null) {
			System.out.println("검색된 내용이 없습니다.");
			return;
		}
		List<Notice> list = nDAO.selectKeyword(keyword);
		for (Notice notice : list)
			System.out.println(notice);
	}

	private String inputKeyword() {
		System.out.print("검색>");
		return sc.nextLine();
	}

	private void insertNotice() {
		Notice notice = inputAll();
		nDAO.insert(notice);
	}

	private Notice inputAll() {
		Notice notice = new Notice();
		System.out.print("제목|");
		notice.setTitle(sc.nextLine());
		System.out.print("내용|");
		notice.setContent(sc.nextLine());
		return notice;
	}

	private void deleteNotice() {
		int boardNumber = inputNumber();
		nDAO.delete(boardNumber);
	}

	private int inputNumber() {
		System.out.println("[번호]");
		return Integer.parseInt(sc.nextLine());
	}

	private void updateNotice() {
		int boardNumber = inputNumber();
		int menuNo = menuSelect();
		while (true) {
			System.out.println("1.제목 2.내용 3.뒤로가기");
			if (menuNo == 1) {
				nDAO.updateTitle(boardNumber);
			} else if (menuNo == 2) {
				nDAO.updateContent(boardNumber);
			} else if (menuNo == 3) {
				break;
			}
		}

	}
}
