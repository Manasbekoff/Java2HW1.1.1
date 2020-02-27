package com.company;

public class Main {

	public static void main(String[] args) {
		Interior interior=new Interior("Wood");
		System.out.println(interior.getInfo());

		Car car = new Car("Tesla", "X", "Leather");
		System.out.println(car.getInfo());
		car.makeSignal("beep", 3);

		Tesla tesla= new Tesla("X", "Кожа");
		System.out.println(tesla.getInfo());




	}
}
