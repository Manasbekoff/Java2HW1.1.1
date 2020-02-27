package com.company;

public final class Interior {
    private String interior;

    public String getInterior() {
        return interior;
    }

    public Interior(String interior) {
        super();
        this.interior = interior;
    }

    public String getInfo() {
        return "Салон " + interior;
    }
}