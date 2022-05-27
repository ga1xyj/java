package com.yedam.java.ch0802;
//매개변수의 다형성
public class Driver { //내가 알고 있는 종류는 vehicle, 방법은 run
	void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		} // 지우면 문법상으로는 오류없지만 실행이 안됨
		vehicle.run();
	}
}
