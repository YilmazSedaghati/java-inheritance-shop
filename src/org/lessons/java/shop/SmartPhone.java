package org.lessons.java.shop;

public class SmartPhone extends Prodotto {

    private String imei;
    private int memory;

    public SmartPhone ( String name, String brand, double ivaPrice, String imei, int memory ) {
        super(name, brand, ivaPrice);
        this.imei = imei;
        this.memory = memory;
    }

    public String getImei () {
        return imei;
    }

    public int getMemory() {
        return memory;
    }

}
