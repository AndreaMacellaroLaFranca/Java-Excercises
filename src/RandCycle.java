import java.util.Random;
import java.util.Scanner;

public class RandCycle {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int rand_int1 = random.nextInt(100);
        System.out.println(rand_int1);


        for(int i = 1; i < 6; i++){


            System.out.print("Inserire un numero da 1 a 100 - TENTATIVO NUMERO: "+i+" - ");
            int numb = scanner.nextInt();

            if (i<=2 && numb==rand_int1){
                System.out.println("Complimenti, che culo! Hai indovinato al tentativo "+i+"!");
                break;
            }

            if (i==3 && numb==rand_int1){
                System.out.println("Ci hai impiegato un po' pero' bravo, hai indovinato al tentativo "+i+"!");
                break;
            } else if (i==4 && numb==rand_int1) {
                System.out.println("Ci hai impiegato un po' pero' bravo, hai indovinato al tentativo "+i+"!");
                break;
            }

            if (i==5 && numb==rand_int1){
                System.out.println("Ti e' andata di lusso, hai indovinato all'ultimo tentativo!");
                break;
            } else if (i==5){
                System.out.println("HAI PERSO");
                break;
            }

            if (numb<rand_int1) {
                System.out.println("Mi dispiace, ritenta. Il numero che sto pensando e' piu' alto");
            } else {
                System.out.println("Mi dispiace, ritenta. Il numero che sto pensando e' piu' basso");
            }

        }

        scanner.close();
    }
}

//Fare in modo che l ultima volta se non indovino mi stampa hai perso------------
//se indovino mi stampa complimenti hai indovinato in n tentativi----------------
//se indovino in 2 tentativi mi dice complimenti che culo ----------------------
//se indovino nel 3 o 4  ci hai impiegato un po pero bravo --------------------
//se indovino nel 5 ti e andata di lusso hai indovinato all ultimo momento----------------