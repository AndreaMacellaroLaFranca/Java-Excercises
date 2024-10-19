package practice.pack.exercises;

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

        System.out.print("Inserire parola da controllare: ");
        String check = sc.nextLine();

        System.out.print("La parola '"+check+"' è presente "+wordCheck(vettore, check)+" volte.");

        sc.close();

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
