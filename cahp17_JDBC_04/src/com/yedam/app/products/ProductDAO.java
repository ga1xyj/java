package com.yedam.app.products;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.yedam.app.common.DAO;

public class ProductDAO extends DAO{
	//싱글톤
	private static ProductDAO productDAO = null;
	private ProductDAO() {}
	public static ProductDAO getInstance() {
		if(productDAO == null) {
			productDAO = new ProductDAO();
		}
		return productDAO;
	}
	
	//등록
	public void insert(Product product) {
		try {
			connect();
			String sql = "INSERT INTO products (product_id, product_name, product_price) VALUES (products_seq.nextval, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getProductName());
			pstmt.setInt(2, product.getProductPrice());
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("정상적으로 등록되었습니다.");
			}else {
				System.out.println("정상적으로 등록되지 않았습니다.");
			}
			//컬럼 지정
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	
	//수정 - 재고
	public void updateStock(Product product) {
		try {
			connect();
			String sql = "UPDATE products SET product_stock =" + product.getProductStock() + "WHERE product_id =" +product.getProductId();
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result > 0) {
				System.out.println("정상적으로 수정되었습니다.");
			} else {
				System.out.println("정상적으로 수정되지 않았습니다.");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	
	//수정 - 이름, 가격
	public void updateInfo(Product product)	{
		try {
			connect();
			String SQL = "UPDATE products SET product_name = ?, product_price = ? WHERE product_id = ?";
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, product.getProductName());
			pstmt.setInt(2, product.getProductPrice());
			pstmt.setInt(3, product.getProductId());
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("정상적으로 수정되었습니다.");
			}else {
				System.out.println("정상적으로 수정되지 않았습니다.");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	
	//삭제
	//delete는 vo클래스 사용 x 기본키로 삭제 
	public void delete(int productId) {
		try {
			connect();
			String sql = "DELETE FROM products WHERE product_id =" + productId;
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result > 0) {
				System.out.println("정상적으로 삭제되었습니다.");
			}else {
				System.out.println("정상적으로 수정되지 않았습니다.");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	
	//단건조회 - 재고이름
	//조건이 2개이상이면 vo클래스
	public Product selectOne(String productName) {
		Product product = null;
		try {
			connect();
			String sql = "SELECT * FROM products WHERE product_name = ?";
			//한행이 나오도록 쿼리 설정
			//쿼리 먼저 디벨로퍼에서 사용 후 자바에서 사용
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, productName);
			rs = pstmt.executeQuery();
			//rs가 계속 행 가져옴(덮어씀)
			if(rs.next()) {
				product = new Product();
				product.setProductId(rs.getInt("product_id"));
				product.setProductName(rs.getString("product_name"));
				product.setProductPrice(rs.getInt("product_price"));
				product.setProductStock(rs.getInt("product_stock"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return product;
		//리턴값 먼저 설정
	}
	//전체조회
	public List<Product> selectAll() {
		List<Product> list = new ArrayList<Product>();
		//인스턴스 생성
		try {
			connect();
			String sql = "SELECT * FROM products ORDER BY product_id";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Product product = new Product();
				product.setProductId(rs.getInt("product_id"));
				product.setProductName(rs.getString("product_nmae"));
				product.setProductPrice(rs.getInt("product_price"));
				product.setProductStock(rs.getInt("product_stock"));
				list.add(product);
				//add 먼저
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}
	
}
