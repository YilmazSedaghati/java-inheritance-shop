package org.lessons.java.shop;

public class Televisore extends Prodotto {

    private double dimension;
    private boolean smart;

    public Televisore ( String name, String brand, double ivaPrice, double dimension, boolean smart) {

        super(name, brand, ivaPrice);
        this.dimension = dimension;
        this.smart = smart;

    }

    public double getDimension() {
        return dimension;
    }

    public boolean isSmart() {
        return smart;
    }

}

//Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
