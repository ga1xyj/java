package ch06.homework;

public class ProductSystem {
	private Product[] list; // 상품 배열 선언 * 클래스도 배열 가능
	private int index;
	
	public ProductSystem() {
		index = -1;
	} // 인덱스만 초기화
	
	//1. 상품 수 입력
	public void setListSize(int size) {
		list = new Product[size];
	}
	
	//2. 상품 및 가격 입력
	public void putProduct(String name, int price) {
		Product product = new Product();
		product.setName(name);
		product.setPrice(price);
		
		list[++index] = product;
	}

	//3. 제품별 가격 출력
	public void printList() {
		for(int i=0; i<= index; i++) {
			//Product product = list[i];
			//System.out.println(product.getName() + " : " + product.getPrice()); 
			//System.out.println(list[i].getName() + " : " + list[i].getPrice()); 
			list[i].showInfo();
		}
	}
	
	//4. 분석 - 최고가격
	int getMax() {
		int max = list[0].getPrice();
		for(int i=0; i<=index; i++) {
			if(max < list[i].getPrice()) {
				max = list[i].getPrice();
			}
		}
		return max;
	}
	
	//4. 분석 - 총합 
	int getSum() {
		int sum = list[0].getPrice();
		for(int i=1; i<=index; i++) { // ?? 
			sum += list[i].getPrice();
		} 
		return sum;
	}
	
	//5. 분석
	public void productInfo() {
		System.out.println("최고 가격 : " + getMax() + "\n총합 : " + (getSum()-getMax()));
	}
}
