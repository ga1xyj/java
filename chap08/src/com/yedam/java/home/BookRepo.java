package com.yedam.java.home;

public class BookRepo implements BookAccess {
	//저장소 -> 싱글톤
	private static BookRepo instance = new BookRepo();
	private BookRepo() {
		init();
	}
	
	private void init() {
		dataList = new Book[100];
		listIndex = -1;
	}
	
	public static BookRepo getInstance() {
		return instance;
	}
	
	//실제 사용 필드
	private Book[] dataList;
	private int listIndex;
	
	//배열에 저장
	@Override
	public void insert(Book book) {
		dataList[++listIndex] = book;
	}

	@Override
	public void update(Book book) {
		for(int i=0; i<=listIndex; i++) {
			if(dataList[i].getIsbn() == book.getIsbn()) {
				dataList[i] = book;
			}
		}
	}

	@Override
	public void delete(int isbn) {
		for(int i=0; i<=listIndex; i++) {
			if(dataList[i].getIsbn() == isbn) {
				dataList[i] = null;
			}
		}
		cleanDataList();
	}
	
	private void cleanDataList() {
		Book[] tempList = dataList;
		int tempIndex = listIndex;
		init();
		for(int i=0; i<=tempIndex; i++) {
			if(tempList[i] != null]) {
				dataList[++listIndex] = tempList[i];
			}
		}
	}
	
	//전체 선택
	@Override
	public Book[] selectAll() {
		Book[] list = new Book[listIndex+1];
		for(int i=0; i<list.length; i++) {
			list[i] = dataList[i];
		}
		return list;
	}
	
	//특정 선택
	@Override
	public Book selectOne(int isbn) {
		Book selected = null;
		for(int i=0; i<=listIndex; i++) {
			if(dataList[i].getIsbn() == isbn) {
				selected = dataList[i];
			}
		}
		return selected;
	}

}
