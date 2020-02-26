package com.company;

public class Car extends Manufacturer{
    private String model;
    private String makeSignal;
    public String getModel() {
        System.out.println("Electrocar");
        return model;
    }

    public Car(String country, String address, String makeSignal) {
        super(country, address);
        this.makeSignal = makeSignal;
    }

    Transmission transmission;
    Manufacturer manufacturer;

    public Car() {
    }

    public Transmission getTransmission(Transmission automatic) {
        return transmission;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }


    public Car(Transmission transmission, Manufacturer manufacturer) {
        this.transmission = transmission;
        this.manufacturer = manufacturer;
    }

    public final void makeSignal (int numbers){
        System.out.println(numbers);
    }

    public void makeSignal (String signal, int numbers){
        for (int i = 0; i <numbers; i++) {
            System.out.println(signal);

        }
    }

    public String getMakeSignal() {
        return makeSignal;
    }


    public String getInfo(){
        return "Коробка передачи" + transmission+
                "Производитель" + manufacturer;
    }
}

