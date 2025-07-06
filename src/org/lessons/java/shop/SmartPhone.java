package org.lessons.java.shop;

public class SmartPhone extends Prodotto {

    private String imei;
    private int memory;

    public SmartPhone ( String name, String brand, double price, String imei, int memory ) {
        super(name, brand, price);
        this.imei = imei;
        this.memory = memory;
    }

    public String getImei () {
        return this.imei;
    }


    public int getMemory() {
        return this.memory;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString( ) { 
        return super.toString() + ", con codice IMEI: " + this.imei + " e " + this.memory + " GB di memoria";
    }

}
