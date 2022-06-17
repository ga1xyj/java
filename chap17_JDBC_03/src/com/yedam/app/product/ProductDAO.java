package com.yedam.app.product;

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
		} return productDAO;
	}
	//CRUD
	//등록
	public void insert(Product product) {
		try {
			connect();
			String sql = "INSERT INTO product VALUES (product_seq.nextval, ?, ?)";
			//시퀀스 이용(값을 넣는 곳에 시퀀스 넣는 형태)
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getProductName());
			pstmt.setInt(2, product.getProductPrice());
			int result = pstmt.executeUpdate();
			if(result>0) {
				System.out.println("정상적으로 등록되었습니다.");
			}else {
				System.out.println("정상적으로 등록되지 않았습니다.");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	//수정 - 가격
	public void update(Product product) {
		try {
			connect();
			//상품id 검색해서 상품 가격 변경
			String sql = "UPDATE product SET product_price = ? WHERE product_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, product.getProductPrice());
			pstmt.setInt(2, product.getProductId());
			int result = pstmt.executeUpdate();
			if(result>0) {
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
	public void delete(Product productId) {
		try {
			connect();
			//상품id 검색해서 상품 가격 변경
			String sql = "DELETE FROM product WHERE product_id =" + productId;
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result > 0) {
				System.out.println("정상적으로 삭제되었습니다.");
			}else {
				System.out.println("정상적으로 삭제되지 않았습니다.");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	//단건조회 - 제품번호
	public Product selectOne(int productId) {
		Product pro = null;
		try {
			connect();
			String sql = "SELECT * FROM product WHERE product_id = " + productId;
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				pro = new Product();
				pro.setProductId(rs.getInt("product_id"));
				pro.setProductName(rs.getString("product_name"));
				pro.setProductPrice(rs.getInt("product_price"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return pro;
	}
	
	//단건조회 - 제품이름
	public Product selectOne(String productName) {
		Product pro = null;
		try {
			connect();
			//보통 prepareS 사용하는게 더 편함
			String sql = "SELECT * FROM product WHERE product_name = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, productName);
			rs = pstmt.executeQuery();
			//statment 사용할때는 productName이 String타입이기 때문에 "" 사용
			//String sql = "SELECT * FROM product WHERE product_name = '" + productName + "'";
			//stmt = conn.createStatement();
			//rs = stmt.executeQuery(sql);
			if(rs.next()) {
				pro = new Product();
				pro.setProductId(rs.getInt("product_id"));
				pro.setProductName(rs.getString("product_name"));
				pro.setProductPrice(rs.getInt("product_price"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return pro;
	}
	
	//전체조회
	public List<Product> selectAll() {
		List<Product> list = new ArrayList<Product>();
		try {
			connect();
			String sql = "SELECT * FROM product ORDER BY product_id";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Product pro = new Product();
				pro.setProductId(rs.getInt("product_id"));
				pro.setProductName(rs.getString("product_name"));
				pro.setProductPrice(rs.getInt("product_price"));
				list.add(pro);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}
}
