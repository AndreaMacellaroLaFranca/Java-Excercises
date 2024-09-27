import java.util.Random;
import java.util.Scanner;

public class RandInv {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Inserire un numero da 1 a 100 da far indovinare alla macchina: ");
        int numb = scanner.nextInt();

        //LA MACCHINA INDOVINA
        int rand_int1 = random.nextInt(5);

        if (rand_int1==numb){
            System.out.println("La macchina ha indovinato!");
        } else if (rand_int1<numb){
            System.out.println("Il numero della macchina e' piu' basso: "+ rand_int1);
        }

        int rand_int2 = random.nextInt();




    }
}
