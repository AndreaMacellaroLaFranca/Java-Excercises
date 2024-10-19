package practice.pack.exercises;

import java.util.Scanner;

public class Palyndrome {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String word = "";

            while (word!="stop") {
                System.out.print("Inserisci una parola per verificare se sia palindroma o scrivi STOP per interrompere il programma: ");
                word = sc.nextLine();
                if (isPalyndrome(word)) {
                    System.out.println("La parola '" + word + "' è un palindromo.");
                } else if (word.equalsIgnoreCase("stop")) {
                    System.out.println("PROGRAMMA INTERROTTO");
                    return;
                } else {
                    System.out.println("La parola '" + word + "' non è un palindromo.");
                }
        }
            sc.close();
    }

    public static boolean isPalyndrome (String word){
        String wordRev = "";
        for (int i = word.length()-1; i >= 0; i--) {
            wordRev += word.charAt(i);
        }
        if (wordRev.equalsIgnoreCase(word)){
            return true;
        } else{
            return false;
        }
    }

}




