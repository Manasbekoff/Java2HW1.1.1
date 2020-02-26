package com.company;

public class Car extends Manufacturer{
    private String color;
    private String name;
    private int year;
    Transmission transmission;

    public Car(String country, String color, String name, int year, Transmission transmission) {
        super("Usa");
        this.color = color;
        this.name = name;
        this.year = year;
        this.transmission = transmission;
    }



    public final String makeSignal (int numbers) {
        System.out.println(numbers);
        return null;
    }

    public String makeSignal (String signal, int numbers){
        for (int i = 0; i <numbers; i++) {
            System.out.println(signal);

        }
        return signal;
    }

    public String getInfo(){
        return "Цвет" + color +
                "Имя" + name +
                "Год" + year;
    }

}

