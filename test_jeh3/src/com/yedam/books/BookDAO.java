package com.yedam.books;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class BookDAO extends DAO {
	private static BookDAO bookDAO = null;

	private BookDAO() {}

	public static BookDAO getInstance() {
		if (bookDAO == null) {
			bookDAO = new BookDAO();
		}
		return bookDAO;
	}

	public void insert(Book book) {
		try {
			connect();
			String sql = "INSERT INTO books (book_name, book_writer, book_content) VALUES (?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getBookName());
			pstmt.setString(2, book.getBookWriter());
			pstmt.setString(3, book.getBookContent());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			discoonect();
		}
	}

	// 책 제목 검색
	public Book selectOne(String bookName) {
		Book book = null;
		try {
			connect();
			String sql = "SELECT * FROM books WHERE book_name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookName);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				book = new Book();
				book.setBookName(rs.getString("book_name"));
				book.setBookWriter(rs.getString("book_writer"));
				book.setBookContent(rs.getString("book_content"));
				book.setBookRental(rs.getInt("book_rental"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			discoonect();
		}
		return book;
	}
	//?
	public List<Book> selectContent(String bookContent) {
		List<Book> list = new ArrayList<>();
		try {
			connect();
			String sql = "SELECT * FROM books WHERE book_content LIKE '%" + bookContent + "%'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Book content = new Book();
				content.setBookName(rs.getString("book_name"));
				content.setBookWriter(rs.getString("book_writer"));
				content.setBookContent(rs.getString("book_content"));
				content.setBookRental(rs.getInt("book_rental"));
				list.add(content);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			discoonect();
		}
		return list;
	}

	public List<Book> selectAll() {
		List<Book> list = new ArrayList<>();
		try {
			connect();
			String sql = "SELECT * FROM books";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Book book = new Book();
				book.setBookName(rs.getString("book_name"));
				book.setBookWriter(rs.getString("book_writer"));
				book.setBookContent(rs.getString("book_content"));
				book.setBookRental(rs.getInt("book_rental"));
				list.add(book);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			discoonect();
		}
		return list;
	}
	
	public List<Book> selectRental() {
		List<Book> list = new ArrayList<>();
		try {
			connect();
			String sql = "SELECT * FROM books WHERE book_rental = 0";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Book book = new Book();
				book.setBookName(rs.getString("book_name"));
				book.setBookWriter(rs.getString("book_writer"));
				book.setBookContent(rs.getString("book_content"));
				book.setBookRental(rs.getInt("book_rental"));
				list.add(book);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			discoonect();
		}
		return list;
	}
	
	public void updateRental(Book book) {
		try {
			connect();
			String SQL = "UPDATE books SET book_rental = 1 WHERE book_name = ?";
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, book.getBookName());
			pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			discoonect();
		}
	}
	
	public void updateReturn(Book book) {
		try {
			connect();
			String SQL = "UPDATE books SET book_rental = 0 WHERE book_name = ?";
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, book.getBookName());
			pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			discoonect();
		}
	}
	
}
