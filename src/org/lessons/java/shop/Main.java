package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {

        Cuffie cuffie1 = new Cuffie("AirPod", "Apple", 159.00, "black", true);

        Cuffie cuffie2 = new Cuffie("allVibes", "dottBeats", 239.00, "cobalt", false);

        Televisore tv1 = new Televisore("simplyOled", "LG", 2679, 22.10, false);

        Televisore tv2 = new Televisore("smarttouched", "Sony", 2999, 100.00, true);

        SmartPhone mobile1 = new SmartPhone("cat100", "caterpillar", 79.00, "10579", 16);

        SmartPhone mobile2 = new SmartPhone("galaxyT", "Samsung", 1079.00, "105222", 32);

        System.out.println("Il codice del prodotto è " + tv1.getCode()
                + "\n Il nome del prodotto è " + tv1.getName()
                + "\n di marca " + tv1.getBrand()
                + "\n Il prezzo del prodotto è " + tv1.getPrice()
                + "\n che ivato è " + tv1.getIvaPrice());
    }
}
