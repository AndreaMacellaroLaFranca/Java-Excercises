package practice.pack;

import java.util.Random;
import java.util.Scanner;

public class Rand {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int rand_int1 = random.nextInt(100);
        System.out.print("Inserire un numero da 1 a 100: ");
        int numb = scanner.nextInt();

        if (numb==rand_int1){
            System.out.println("Complimenti hai indovinato il numero che stavo pensando al primo tentativo!");
            return;
        } else if (numb<rand_int1) {
            System.out.println("Mi dispiace, ritenta. Il numero che sto pensando e' piu' alto - TENTATIVI RIMASTI: 4");
        } else {
            System.out.println("Mi dispiace, ritenta. Il numero che sto pensando e' piu' basso - TENTATIVI RIMASTI: 4");
        }


        System.out.print("Inserire un numero da 1 a 100: ");
        numb = scanner.nextInt();

        if (numb==rand_int1){
            System.out.println("Complimenti hai indovinato il numero che stavo pensando al secondo tentativo!");
            return;
        } else if (numb<rand_int1) {
            System.out.println("Mi dispiace, ritenta. Il numero che sto pensando e' piu' alto - TENTATIVI RIMASTI: 3");

        } else {
            System.out.println("Mi dispiace, ritenta. Il numero che sto pensando e' piu' basso - TENTATIVI RIMASTI: 3");
        }


        System.out.print("Inserire un numero da 1 a 100: ");
        numb = scanner.nextInt();

        if (numb==rand_int1){
            System.out.println("Complimenti hai indovinato il numero che stavo pensando al terzo tentativo!");
            return;
        } else if (numb <rand_int1) {
            System.out.println("Mi dispiace, ritenta. Il numero che sto pensando e' piu' alto - TENTATIVI RIMASTI: 2");

        } else {
            System.out.println("Mi dispiace, ritenta. Il numero che sto pensando e' piu' basso - TENTATIVI RIMASTI: 2");
        }


        System.out.print("Inserire un numero da 1 a 100: ");
        numb = scanner.nextInt();

        if (numb==rand_int1){
            System.out.println("Complimenti hai indovinato il numero che stavo pensando al quarto tentativo!");
            return;
        } else if (numb <rand_int1) {
            System.out.println("Mi dispiace, ritenta. Il numero che sto pensando e' piu' alto - TENTATIVI RIMASTI: 1");

        } else {
            System.out.println("Mi dispiace, ritenta. Il numero che sto pensando e' piu' basso - TENTATIVI RIMASTI: 1");
        }


        System.out.print("Inserire un numero da 1 a 100: ");
        numb = scanner.nextInt();

        if (numb==rand_int1){
            System.out.println("Complimenti hai indovinato il numero che stavo pensando al quinto tentativo!");

        } else {
            System.out.println("Mi dispiace, hai perso:(\nIl numero che stavo pensando era "+rand_int1+".");
        }

        scanner.close();
    }
}
