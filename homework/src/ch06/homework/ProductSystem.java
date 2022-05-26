package ch06.homework;

public class ProductSystem {
	private Product[] list; // 상품 배열 선언 * 클래스도 배열 가능
	private int index;
	
	public ProductSystem() { // 생성자
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
	}sgetg
	
	//4. 분석 - 최고가격
	int getMax() {						// 중복되는 가격이 없다는 전제하에
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
		int sum = 0;
		for(int i=0; i<=index; i++) {
			sum += list[i].getPrice();
		} 
		return sum;
	}
	
	String getMaxProduct() {
		int max = list[0].getPrice();
		String maxProduct = null;
		for(int i=0; i<=index; i++) {
			if(max < list[i].getPrice()) {
				max = list[i].getPrice();
			maxProduct = list[i].getName();
			}
		}
		return maxProduct;
	}
 	
	/*향상된 for문 ???
	for(product temp : list) {
			sum += temp.getPrice();
	Product getMax = getMaxPriceInfo();
	in result = sum - max.getPrice();
	int result = sum - getMaxPriceInfo().gerPrice();
    }*/
	
	//반복문
	/*for(Product temp : list) {
		if(temp.getPrice() == maxInfo.getPrice()
			continue;
			result += temp.getPrice();}
	continue, break;
	*/
	
	
	
	//5. 분석
	public void productInfo() {
		System.out.println("최고 가격 제품 : " + getMaxProduct() + "\n최고 가격 : " + getMax() + "\n총합 : " + (getSum()-getMax()));
	}
}
