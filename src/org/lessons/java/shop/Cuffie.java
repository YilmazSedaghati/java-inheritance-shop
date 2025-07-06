package org.lessons.java.shop;

public class Cuffie extends Prodotto {

    private String colour;
    private boolean wireless;

    public Cuffie ( String name, String brand, double price, String colour, boolean wireless) {

        super(name, brand, price);
        this.colour = colour;
        this.wireless = wireless;

    }

    public String getColour() {
        return colour;
    }

    public boolean isWireless() {
        return wireless;
    }

}