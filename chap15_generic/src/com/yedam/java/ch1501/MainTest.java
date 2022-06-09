package com.yedam.java.ch1501;

public class MainTest {

	public static void main(String[] args) {
		Bag bag = new Bag();
		
		bag.set(new Note());
		Note note = (Note)bag.get();
		//리턴타입이 Object라 강제로 Note로 캐스팅 해줘야함
		bag.set("신운하");
		String name = (String)bag.get();
		
		/* 오류 발생
		bag.set(new Note());
		String name = (String)bag.get();
		//리턴타입이 Object라 강제로 Note로 캐스팅 해줘야함
		bag.set("신운하");
		Note note = (Note)bag.get();
		*/
		
		Box<Note, String, Integer> box = new Box<>();
		box.setT(note);
		box.setK(500);
		box.setV("홍길동");
		
		Note memo = box.getT();
		int num = box.getK();
		String str = box.getV();
		
		//클래스에서 제네릭 타입 사용
		Box<Car, Bus, Taxi> vehicle = new Box<>();
		vehicle.setT(new Car());
		vehicle.setK(new Taxi());
		vehicle.setV(new Bus());
	}

}

class Car{}
class Bus{}
class Taxi{}