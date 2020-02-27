package com.company;

public class Car extends Manufacturer {
    public String name;
    Transmission transmission;

    public Car(String name, String model, String interior) {
        super(name, model, interior);
    }

    public Car(String model, String interior) {
        super(model, interior);
    }


    public String getName() {
        return name;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public final void makeSignal(int numbers) {
        System.out.println(numbers);
    }

    public void makeSignal (String signal, int numbers){
        for (int i = 0; i <numbers; i++) {
            System.out.println(signal);

        }
    }

    public String getInfo(){
        return "Имя " + name +
                " Трансмиссия " + transmission ;
    }

}

