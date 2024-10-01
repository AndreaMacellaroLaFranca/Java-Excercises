package practice.pack;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Inserire la grandezza dell'array: ");
        int lengthArray = sc.nextInt();
        sc.nextLine();

        String[] vettore = new String[lengthArray];

        for (int i=0; i < vettore.length; i++){
            System.out.print("Inserire parola numero "+(i+1)+": ");
            vettore[i]=sc.nextLine();
        }

        System.out.println(Arrays.toString(vettore));

        System.out.print("Inserire parola da controllare: ");
        String check = sc.nextLine();

        System.out.print("La parola "+check+" e' presente "+wordCheck(vettore, check)+" volte.");

    }
    public static int wordCheck (String[] vettore, String check){
        int counter = 0;
        for (int i = 0; i < vettore.length; i++){
            if(vettore[i].equalsIgnoreCase(check)) {
                counter++;
            }
        }
        return counter;
    }

}
