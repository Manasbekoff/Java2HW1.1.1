package com.company;

public class Main {

	public static void main(String[] args) {
		Interior interior=new Interior("Wood");
		System.out.println(interior.getInfo());

		Car car = new Car("USA", "Dark", 2020, "Tesla", Transmission.AUTOMATIC);
		System.out.println(car.getInfo());
		car.makeSignal("beep", 3);

		Tesla tesla= new Tesla("USA", "Black", 2020, "Tesla", Transmission.MANUAL, "X", interior);
		System.out.println(tesla.getInfo());
		tesla.makeSignal("Signal", 2 );
		Tesla tesla1 = new Tesla("America", "Grey", 2020, "Tesla", Transmission.AUTOMATIC,"S", interior);
		System.out.println(tesla1.getInfo());







	}
}
