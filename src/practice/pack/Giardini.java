package practice.pack;

import java.util.Scanner;

public class Giardini {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Inserire citta di residenza: ");
        String citta = sc.nextLine();

        System.out.print("Inserire professione: ");
        String professione = sc.nextLine();

        System.out.print("Doni regolarmente il sangue?: (s/n)");
        String donor = sc.nextLine();

        int price = 10;
        int sconto = 0;

        if (citta.equalsIgnoreCase("Cisterna") || citta.equalsIgnoreCase("Latina")) {
            sconto += 3;
            price -= 3;
            System.out.println("Sconto di 3 euro perche sei di Cisterna o Latina");
        } else if (citta.equalsIgnoreCase("Sezze")) {
            sconto += 5;
            price -= 5;
            System.out.println("Sconto di 5 euro perche sei di Sezze");
        }

        if (professione.equalsIgnoreCase("Studente") || professione.equalsIgnoreCase("Insegnante")) {
            sconto += 2;
            price -= 2;
            System.out.println("Sconto di 2 euro perche sei uno studente/insegnante");
        }

        if (donor.equalsIgnoreCase("s")) {
            sconto += 1;
            price -= 1;
            System.out.println("Sconto di 1 euro perche sei un donatore di sangue");
        }

        System.out.println("Il prezzo del biglietto e' $" + price + ". Hai risparmiato $" + sconto +".");

        sc.close();
    }
}