package com.company;

public abstract class Manufacturer {
    private String country;
    private String color;
    private int year;

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public Manufacturer(String country, String color, int year) {
        super();
        this.country = country;
        this.color = color;
        this.year = year;
    }
    public String getInfo(){
        return "Country " + country+
                " color " + color +
                "year" + year;
    }

}

