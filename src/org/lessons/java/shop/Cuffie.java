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

    public boolean getWireless() {
        return wireless;
    }

    public String isWireless() {
        if ( !wireless ) {
            return "le cuffie non sono wireless";
        }   else {
            return "le cuffie sono wireless";
        }
     }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

     @Override
    public String toString() {
        return super.toString() + ", di colore " + this.colour + " inoltre " + this.isWireless();
    }

}