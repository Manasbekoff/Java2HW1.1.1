package com.company;

public class Main {

    public static void main(String[] args) {
	Car car = new Car();
	car.getModel();
	car.getTransmission(Transmission.AUTOMATIC);
	car.makeSignal("Beeep", 3);
	Tesla tesla = new Tesla();
	tesla.getName();
	tesla.getYear();
	tesla.makeSignal("Beep",2 );
	Interior interior = new Interior();
	interior.makeSignal("Beeeep", 2);

    }
    }

