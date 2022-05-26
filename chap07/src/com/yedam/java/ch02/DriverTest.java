package com.yedam.java.ch02;

public class DriverTest {

	public static void main(String[] args) {
		Driver driver = new Driver();
		/*
		 * Bus bus = new Bus();
		 * driver.dirve(bus);
		 * bus.run();
		 */
		driver.drive(new Bus());
		driver.drive(new Taxi());
		driver.drive(new Vehicle());
	}

}
