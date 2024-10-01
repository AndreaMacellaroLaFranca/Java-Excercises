package practice.pack;

import java.util.Scanner;

public class MethodsCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Scegli il tipo di operazione: somma, sottrazione, moltiplicazione o divisione: ");
        String operazione = sc.nextLine();

        if (operazione.equals("somma")){

            System.out.print("Inserire primo numero da sommare: ");
            int a = sc.nextInt();

            System.out.print("Inserire secondo numero da sommare: ");
            int b = sc.nextInt();

            System.out.print("Il risultato della somma e': " + somma(a,b));

        } else if (operazione.equals("sottrazione")){

            System.out.print("Inserire primo numero da sottrarre: ");
            int a = sc.nextInt();

            System.out.print("Inserire secondo numero da sottrarre: ");
            int b = sc.nextInt();

            System.out.print("Il risultato della sottrazione e': " + sottrazione(a,b));

        } else if (operazione.equals("moltiplicazione")){

            System.out.print("Inserire primo numero da moltiplicare: ");
            int a = sc.nextInt();

            System.out.print("Inserire secondo numero da moltiplicare: ");
            int b = sc.nextInt();

            System.out.print("Il risultato della moltiplicazione e': " + moltiplicazione(a,b));

        } else if (operazione.equals("divisione")){

            System.out.print("Inserire primo numero da dividere: ");
            int a = sc.nextInt();

            System.out.print("Inserire secondo numero da dividere: ");
            int b = sc.nextInt();

            if (b==0){
                System.out.println("IMPOSSIBILE DIVIDERE PER ZERO");
                return;
            }

            System.out.print("Il risultato della divisione e': " + divisione(a,b));
        }

        sc.close();

    }

    public static int somma(int a,int b){
        int res = a+b;
        return res;
        //oppure return a+b;
    }

    public static int sottrazione(int a,int b){
        int res = a-b;
        return res;
    }

    public static int moltiplicazione(int a,int b){
        int res = a*b;
        return res;
    }

    public static float divisione(float a,float b){
        float res = a/b;
        return res;
    }





}
