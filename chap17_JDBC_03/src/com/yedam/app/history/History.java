package com.yedam.app.history;

public class History {
		private int productId;
		//오라클:boolean 타입 없음 0,1 or 1,2로 구분
		//1:입고, 2:출고
		private int ProductCategory;
		private int productAmount;
		
		//필드 생성 후 getter, setter
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public int getProductCategory() {
			return ProductCategory;
		}
		public void setProductCategory(int productCategory) {
			ProductCategory = productCategory;
		}
		public int getProductAmount() {
			return productAmount;
		}
		public void setProductAmount(int productAmount) {
			this.productAmount = productAmount;
		}
		
		//toString 오버라이딩 필요 x

		
}
