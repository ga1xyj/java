package com.yedam.app.history;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.yedam.app.common.DAO;

public class HistoryDAO extends DAO {
	//DAO-DB에 대한 정보
	//각각의 테이블에 접근하는 클래스는 싱글톤 / CRUD로 구성
	
	//싱글톤
	private static HistoryDAO historyDAO = null;
	private HistoryDAO() {}
	public static HistoryDAO getInstance() {
		if(historyDAO == null) {
			historyDAO = new HistoryDAO();
		}
		return historyDAO;
	}
	//CRUD
	//등록
	public void insert(History history) {
		try {
			connect();
			String sql = "INSERT INTO product_history VALUES(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, history.getProductId());
			pstmt.setInt(2, history.getProductCategory());
			pstmt.setInt(3, history.getProductAmount());
			int result = pstmt.executeUpdate();
			if(result > 0) {
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
	
	//수정 - 수량
	public void update(History history) {
		try {
			connect();
			String sql = "UPDATE product_history SET product_amount = ? WEHRE product_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, history.getProductAmount());
			pstmt.setInt(2, history.getProductId());
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("정상적으로 수정되었습니다.");
			}else {
				System.out.println("정상적으로 수정되지 않았습니다.");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	
	//삭제
	public void delete(int productId) {
		try {
			connect();
			String sql = "DELETE FROM product_history WHERE product_id =" + productId;
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
	
	//단건조회 - 각 상품에 대한 입고량
	public int selectInAmount(int productId) {
		int result = 0;
		try {
			connect();
			String sql = "SELECT SUM(product_amount) as sum FROM product_history WHERE product_id = ? AND product_category = 1";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, productId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = rs.getInt("sum"); //별칭
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}
	//리턴타입이 있을때는 리턴 먼저
	
	//단건조회 - 각 상품에 대한 출고량
	public int selectOutAmount(int productId) {
		int result = 0;
		try {
			connect();
			String sql = "SELECT SUM(product_amount) as sum FROM product_history WHERE product_id = ? AND product_category = 2";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, productId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = rs.getInt("sum"); //별칭
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}
	
	//전체조회 - 전체 상품의 각 재고 
	public Map<Integer, Integer> selectAllAmount() {
		Map<Integer, Integer> list = new HashMap<>();
		try {
			connect();
			//각 제품에 따른 입고량과 출고량
			String sql = "SELECT product_id, product_category, SUM(product_amount) as amount FROM product_history GROUP BY product_id, product_category";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			//입고와 출고에 따른 각각의 목록
			Map<Integer, Integer> inList = new HashMap<>();
			Map<Integer, Integer> outList = new HashMap<>();
			//입고량과 출고량 분리 
			while(rs.next()) {
				int category = rs.getInt("product_category");
				if(category == 1) {
					inList.put(rs.getInt("product_id"), rs.getInt("amount"));
				} else {
					outList.put(rs.getInt("product_id"), rs.getInt("amount"));
				}
			}
			//재고
			Set<Integer> keySet = inList.keySet();
			for(int key : keySet) {
				int inAmount = inList.get(key);
				Integer outAmount = outList.get(key);
				if(outAmount != null) {
					list.put(key, (inAmount - outAmount)); //입고량-출고량=재고
				}else {
					list.put(key, inAmount);
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}
	//클래스는 필드에 들어가서 다시한번 검산하기 때문에 Map을 쓰는게 좋음
}
