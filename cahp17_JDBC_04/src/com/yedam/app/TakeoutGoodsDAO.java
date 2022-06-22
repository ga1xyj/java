package com.yedam.app;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.yedam.app.common.DAO;
import com.yedam.app.deal.DealInfo;
import com.yedam.app.products.ProductDAO;

public class TakeoutGoodsDAO extends DAO{
	//싱글톤
	private static TakeoutGoodsDAO dao = null;
	private TakeoutGoodsDAO () {}
	public static TakeoutGoodsDAO getInstance() {
		if (dao == null) {
			dao = new TakeoutGoodsDAO();
		}
		return dao;
	}
	//등록
	public void insert(DealInfo info) {
		try {
			connect();
			String sql = "INSERT INTO take_out_goods (product_id, product_amount) VALUES (?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, info.getProductId());
			pstmt.setInt(2, info.getProductAmount());
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("정상적으로 등록되었습니다.");
			}else {
				System.out.println("정상적으로 등록되지 않았습니다.");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	//단건조회-출고내역 존재 유무
	/*public boolean selectInfo(int productId) {	
		boolean isSelected = false;
		try {
			connect();
			String sql = "SELECT COUNT(*) AS count FROM take_out_goods WHERE product_id =" + productId;
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				if(rs.getInt("count") > 0) {
					isSelected = true;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return isSelected;
	}*/
	//단건조회-출고수량
	public int selectAmount(int productId) {
		int amount = 0;
		try {
			connect();
			String sql = "SELECT NVL(SUM(product_amount), 0) AS sum FROM take_out_goods WHERE product_id =" + productId;
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				amount = rs.getInt("sum");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return amount;
	}
	//전체조회-현재까지 출고된 내역
	public List<DealInfo> selectAll() {
		List<DealInfo> list = new ArrayList<>();
		try {
			connect();
			String sql = "SELECT t.deal_date, t.product_id, p.product_name, t.product_amount FROM products p JOIN take_out_goods t ON p.product_id = t.product_id ORDER BY t.deal_date";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				DealInfo info = new DealInfo();
				info.setDealDate(rs.getDate("deal_date"));
				info.setProductId(rs.getInt("product_id"));
				info.setProductName(rs.getString("product_name"));
				info.setProductAmount(rs.getInt("product_amount"));
				list.add(info);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}
	
	//전체조회 - 해당 날짜에 출고된 내역
	public List<DealInfo> selectAll(Date dealDate) {
		List<DealInfo> list = new ArrayList<>();
		try {
			connect();
			String sql = "SELECT t.deal_date, t.product_id, t.product_name, t.product_amount FROM products p JOIN take_out_goods t ON p.product_id = t.product_id WHERE deal_date = ? ORDER BY t.deal_date";
			pstmt = conn.prepareStatement(sql);
			pstmt.setDate(1, dealDate);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				DealInfo info = new DealInfo();
				info.setDealDate(rs.getDate("deal_date"));
				info.setProductId(rs.getInt("product_id"));
				info.setProductName(rs.getString("product_name"));
				info.setProductAmount(rs.getInt("product_amount"));
				list.add(info);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}
	
	//전체조회 - 해당 제품의 출고된내역
	public List<DealInfo> selectAll(int productId) {
		List<DealInfo> list = new ArrayList<>();
		try {
			connect();
			String sql = "SELECT t.deal_date, t.product_id, p.product_name, t.product_amount FROM products t JOIN take_out_goods t ON p.product_id = t.product_id WHERE product_id = ? ORDER BY t.deal_date";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, productId);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				DealInfo info = new DealInfo();
				info.setDealDate(rs.getDate("deal_date"));
				info.setProductId(rs.getInt("product_id"));
				info.setProductName(rs.getString("product_name"));
				info.setProductAmount(rs.getInt("product_amount"));
				list.add(info);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}
	
	
}
