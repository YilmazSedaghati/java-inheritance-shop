package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero di prodotti che vuoi creare (puoi aggiungerne un massimo di 6 alla volta) :");
        int nProdAdd = Integer.parseInt(scanner.nextLine());

        if (nProdAdd > 6) {
            nProdAdd = 6;
        }


        Prodotto[ ] prodotti = new Prodotto[nProdAdd];

        for (int i = 0; i < prodotti.length; i++) {

            System.out.println("Inserisci il nome del prodotto che vuoi aggiungere al carrello:");
            String nomeProdotto = scanner.nextLine();

            System.out.println("Inserisci la marca del prodotto che vuoi aggiungere al carrello:");
            String marcaProdotto = scanner.nextLine();

            System.out.println("Inserisci il prezzo del prodotto che vuoi aggiungere al carrello:");
            double prezzo = Double.parseDouble(scanner.nextLine());

            System.out.println("Quale tipo di prodotto vuoi inserire? Puoi selezionare tra smartphone (digita 1), televisore (digita 2) e cuffie (digita 3).");
            int userSelection = Integer.parseInt(scanner.nextLine());

            switch (userSelection) {
                case 1:             

                    System.out.println("Dammi il valore IMEI del cellulare");
                    String imei = scanner.nextLine();

                    System.out.println("Ora inserisci la memoria che possiede");
                    int memory = Integer.parseInt(scanner.nextLine());

                    SmartPhone newSmartPhone = new SmartPhone(nomeProdotto, marcaProdotto, prezzo, imei, memory);

                    prodotti[i] = newSmartPhone;

                    break;

                case 2:         

                    System.out.println("Dimmi le dimensioni del televisore");
                    double dimension = Double.parseDouble(scanner.nextLine());

                    System.out.println("E' una smart tv? Scrivi true o false");
                    boolean smart = Boolean.parseBoolean(scanner.nextLine());

                    Televisore newTv = new Televisore(nomeProdotto, marcaProdotto, prezzo, dimension, smart);

                    prodotti[i] = newTv;
                    break;

                case 3:                 

                    System.out.println("Di che colore sono le cuffie?");
                    String colour = scanner.nextLine();

                    System.out.println("Sono wireless? Scrivi true o false");
                    boolean wireless = Boolean.parseBoolean(scanner.nextLine());

                    Cuffie newCuffie = new Cuffie(nomeProdotto, marcaProdotto, prezzo, colour, wireless);

                    prodotti[i] = newCuffie;

                    break;

                default:
                System.out.println("Il tipo di prodotto non è riconosciuto: verrà aggiunto come prodotto generico");
                    prodotti[i] = new Prodotto(nomeProdotto, marcaProdotto, prezzo);
                    break;
            }
        }

        scanner.close();

        System.out.println("Contenuto del carrello: ");

        for (Prodotto prodotto : prodotti) {

            System.out.println(prodotto);
            System.out.println("---------------------------------------------");

        }
    }
}
