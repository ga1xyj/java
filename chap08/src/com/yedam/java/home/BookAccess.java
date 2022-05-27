package com.yedam.java.home;

public interface BookAccess {

	public void insert(Book book);
	
	public void update(Book book);
	
	public void delete(int isbn);
	
	public Book[] selectAll();
	
	public Book selectOne(int isbn);
}
