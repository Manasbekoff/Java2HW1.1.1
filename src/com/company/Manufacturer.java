package com.company;

public abstract class Manufacturer {
    private String country;
    private String color;
    private String year;

    public Manufacturer(String model, String interior) {

    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public String getYear() {
        return year;
    }

    public Manufacturer(String country, String color, String year) {
        this.country = country;
        this.color = color;
        this.year = year;
    }
}

