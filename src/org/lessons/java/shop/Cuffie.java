package org.lessons.java.shop;

public class Cuffie extends Prodotto {

    private String colour;
    private boolean wireless;

    public Cuffie ( String name, String brand, double ivaPrice, String colour, boolean wireless) {

        super(name, brand, ivaPrice);
        this.colour = colour;
        this.boolean = wireless;

    }

    public String getColour() {
        return colour;
    }

    public boolean isWireless() {
        return wireless;
    }

}


//Cuffie, caratterizzate dal colore e se sono wireless o cablate