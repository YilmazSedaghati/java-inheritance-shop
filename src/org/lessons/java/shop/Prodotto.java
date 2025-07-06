package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    private int code;
    private String name;
    private String brand;
    private double price;
    private double ivaPrice;

    private static Random randValueGen = new Random();

    public Prodotto(String name, String brand, double price) {

        this.code = randValueGen.nextInt(10000);
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.ivaPrice = price * ( 1.22 );

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand (String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Il prezzo inserito non è valido!!! Inserirlo nuovamente!!!");
        }
    }

    public double getIvaPrice() {
        return ivaPrice;
    }

    @Override
    public String toString( ) {
        return "Il Prodotto da te scelto è con il codice " + this.code
        + " e si chiama " + this.name 
        + " del marchio " + this.brand 
        + " che costa " + this.price
        + " e che ivato viene in euro " + this.ivaPrice ;
    }

}