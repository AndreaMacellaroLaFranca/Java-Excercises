package practice.pack;

import java.util.Scanner;

public class DiscoJava {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Sei uomo o donna?: ");
        String gender = sc.nextLine();

        System.out.print("Sei arrivato/a prima o dopo l'una?: ");
        String time = sc.nextLine();

        int price = 0;

        if (gender.equalsIgnoreCase("uomo") && time.equalsIgnoreCase("prima")) {
            price+=10;
        }else if (gender.equalsIgnoreCase("uomo") && time.equalsIgnoreCase("dopo")){
            price +=20;
        }

        if (gender.equalsIgnoreCase("donna") && time.equalsIgnoreCase("prima")) {
            price = 0;
        }else if (gender.equalsIgnoreCase("donna") && time.equalsIgnoreCase("dopo")){
            price +=10;
        }

        System.out.println("Il prezzo del tuo biglietto e': $"+price);

        sc.close();
    }
}
