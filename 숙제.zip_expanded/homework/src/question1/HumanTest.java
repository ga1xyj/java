package question1;

import java.util.Scanner;

public class HumanTest {

	public static void main(String[] args) {
		StandaradWeightInfo standaradWeightInfo = new StandaradWeightInfo();
		standaradWeightInfo.name = "홍길동";
		standaradWeightInfo.height = 168;
		standaradWeightInfo.weight = 45;
		standaradWeightInfo.getStandardWeight();
		standaradWeightInfo.getInformation();
		
		
		ObesityInfo obeseityinfo= new ObesityInfo();
		obeseityinfo.name = "박둘이";
		obeseityinfo.height = 168;
		obeseityinfo.weight = 90;
		obeseityinfo.getObesity();
		obeseityinfo.getObesityIndex();
		obeseityinfo.getInformation();
		
	}

}
