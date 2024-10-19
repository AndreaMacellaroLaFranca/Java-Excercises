package practice.pack.exercises;

import java.util.Scanner;

public class MediaClasse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quanti studenti sono presenti nella classe?: ");
        int nStudenti = sc.nextInt();

        int grade = 0;
        int sommaVoti = 0;

        for (int i = 0; i<nStudenti; i++){
            System.out.print("Inserire media voti studente numero "+(i+1)+": ");
            grade = sc.nextInt();
            sommaVoti+=grade;
        }

        float media = (float)sommaVoti/(float)nStudenti;

        System.out.println("La media della classe e': "+ media);

        sc.close();

    }
}
