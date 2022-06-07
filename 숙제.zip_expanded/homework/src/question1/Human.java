package question1;

public class Human {
	protected String name;
	protected int height;
	protected int weight;
	
	public Human () {}
	
	public Human (String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void getInformation() {
		System.out.println(name+"님의 신장 " + height + ", 몸무게 " + weight + "입니다.");
	}
	

}
