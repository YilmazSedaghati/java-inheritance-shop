package org.lessons.java.shop;

public class Televisore extends Prodotto {

    private double dimension;
    private boolean smart;

    public Televisore ( String name, String brand, double price, double dimension, boolean smart) {

        super(name, brand, price);
        this.dimension = dimension;
        this.smart = smart;

    }

    public double getDimension() {
        return dimension;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

}
