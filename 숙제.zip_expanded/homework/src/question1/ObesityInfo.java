package question1;

public class ObesityInfo extends StandaradWeightInfo{
	public double obesity;
	public String obesityIndex;
	
	
	public double getObesity() {
		this.obesity = (weight - sWeight) / sWeight * 100;
		return obesity;
	}
	
	public String getObesityIndex () {
		if(obesity<=18.5) {
			obesityIndex = "저체중";
		} else if (18.5<obesity && obesity<23) {
			obesityIndex = "정상";
		} else if (23<obesity && obesity<25) {
			obesityIndex = "과체중";
		} else if (25<obesity) {
			obesityIndex = "비만";
		} else {
			obesityIndex = "BMI 측정 오류";
		}
		return obesityIndex;
	}

	public void getInformation() {
		System.out.println(name+"님의 신장 " + height + ", 몸무게 " + weight + ", " + obesityIndex + "입니다.");
	}
}
