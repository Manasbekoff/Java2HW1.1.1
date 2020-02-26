package com.company;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("Usa", "Black", "Tesla", 2020, Transmission.AUTOMATIC);
		car.getInfo();
		Tesla tesla = new Tesla("X");
		tesla.makeSignal("Beep", 3);
	}
}
