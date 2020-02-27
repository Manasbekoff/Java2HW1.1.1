package com.company;

public class Tesla extends Car {
    private String model;
    private Interior interior;


    public Tesla(String country, String color, int year, String name, Transmission transmission, String model, Interior interior) {
        super(country, color, year, name, transmission);
        this.model = model;
        this.interior = interior;
    }

    public String getModel() {
        return model;
    }

    public Interior getInterior() {
        return interior;
    }

    @Override
    public String getInfo() {
        return "Модель " + model +
                " Салон " + interior;
    }
}