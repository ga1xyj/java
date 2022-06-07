package question1;

public class StandaradWeightInfo extends Human{
	public double sWeight;
	
	public double getStandardWeight() {
		this.sWeight=(height-100)*0.9;
		return sWeight;
	}

	public void getInformation() {
		System.out.println(name+"님의 신장 " + height + ", 몸무게 " + weight + ", 표준체중 " + sWeight + " 입니다.");
	}
}
