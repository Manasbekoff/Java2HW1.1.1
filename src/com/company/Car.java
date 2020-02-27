package com.company;

public class Car extends Manufacturer {
    private String name;
    Transmission transmission;

    public Car(String country, String color, int year, String name, Transmission transmission) {
        super(country, color, year);
        this.name=name;
        this.transmission=transmission;
    }

    public final void makeSignal(int numbers) {
        System.out.println(numbers);
    }

    public void makeSignal (String signal, int numbers){
        for (int i = 0; i <numbers; i++) {
            System.out.println(signal);

        }
    }

    public String getName() {
        return name;
    }

    public Transmission getTransmission() {
        return transmission;
    }
    @Override
    public String getInfo(){
        return super.getInfo() + "Имя " + name +
                " Трансмиссия " + transmission ;
    }

}

