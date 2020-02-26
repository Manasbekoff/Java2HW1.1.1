package com.company;

public class Manufacturer{
    public String makeSignal;
    private String country;
    private String address;

    public Manufacturer() {
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public Manufacturer(String country, String address) {
        this.country = country;
        this.address = address;
    }
    public String getMakeSignal() {
        return makeSignal;
    }

}