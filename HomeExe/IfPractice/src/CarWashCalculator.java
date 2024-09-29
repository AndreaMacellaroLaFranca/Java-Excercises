import java.util.Scanner;

public class CarWashCalculator {
    public static void main(String[] args){

        //VARIABLES

        final int BASEPRICE = 10;
        int carWashPrice = 0;

        //USER INPUT

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Inserire costo auto: $");
        double carPrice = sc.nextDouble();

        sc.nextLine();
        System.out.print("L'auto in questione e' elettrica?: ");
        String carType = sc.nextLine();

        System.out.print("Sei socio ACI?: ");
        String partner = sc.nextLine();

        System.out.print("Sei un nostro abbonato?: ");
        String member = sc.nextLine();

        //INIZIO CALCOLATORE

        if (member.equalsIgnoreCase("si")){
            carWashPrice = 0;
            System.out.println("Il costo del tuo biglietto e' di $"+carWashPrice+"! Sempre gratis per tutti gli abbonati!");
            return;
        }

        if (carPrice>30000){
            carWashPrice+=5;
            System.out.println("+$5 extra per assicurazione.");
        }

        if (carType.equalsIgnoreCase("si")){
            carWashPrice+=5;
            System.out.println("+$5 extra per security.");
        }

        if (partner.equalsIgnoreCase("si")) {
            carWashPrice-=5;
            System.out.println("Sconto di 5$ per i soci ACI.");
        }

        System.out.println("Il costo del tuo biglietto e' di $"+(carWashPrice+BASEPRICE)+".");

        sc.close();
    }
}
