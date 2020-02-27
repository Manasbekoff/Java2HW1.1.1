package com.company;

public class Tesla extends Car {
    private String model;
    private String interior;


    public Tesla(String model, String interior) {
        super(model, interior);
        this.model = model;
        this.interior = interior;
    }

    public String getModel() {
        return model;
    }

    public String getInterior() {
        return interior;
    }

    @Override
    public String getInfo() {
        return "Модель " + model +
                " Салон " + interior;
    }
}