package com.company;

public class Tesla extends Car {
    private String model;
    Interior interior;


    public Tesla(String model){
        super("Usa", "Black", "Tesla", 2020, Transmission.AUTOMATIC);
        this.model = model;
    }
    public String getModel(){
        return model;
    }


    @Override
    public String getInfo() {
        return "Модель" + model;
    }
}