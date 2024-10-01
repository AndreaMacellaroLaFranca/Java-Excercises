package practice.pack;

import java.util.Scanner;

public class Palyndrome {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci una parola per verificare se sia palindroma: ");
        String word = sc.nextLine();

        System.out.println(palyndrome(word));

    }

    public static String palyndrome (String word){
        String nonPalyndrome = "La parola "+word+" non e' palindroma";
        int wordLength = word.length();
        String wordRev = "";
        for (int i = wordLength-1; i >= 0; i--) {
            wordRev += word.charAt(i);
        }
        if (wordRev.equalsIgnoreCase(word)){
            return "La parola "+word+" e' palindroma";
        }else{
            return nonPalyndrome;
        }
    }

}
