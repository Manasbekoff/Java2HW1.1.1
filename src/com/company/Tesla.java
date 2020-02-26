package com.company;

public final class Tesla extends Car {
    private int year;
    private int engineCapacity;
    private String name;

    public void getName() {
        System.out.println("Tesla");
    }

    public Tesla(String name) {
        this.name = name;
    }

    public int getYear() {
        System.out.println("2020");
        return year;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public Tesla(int year, int engineCapacity) {
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    public Tesla() {
    }

    @Override
    public String getInfo() {
        return "Год" + year +
                "Объем двигателя" + engineCapacity;
    }
}