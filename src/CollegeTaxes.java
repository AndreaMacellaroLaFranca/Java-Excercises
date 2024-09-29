import java.util.Currency;
import java.util.Scanner;

public class CollegeTaxes {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double tasse = 0;
        double scolarship = 0;
        int votoDiploma = 0;
        String pari = "";

        System.out.print("Inserire ISEE: $");
        double isee = sc.nextDouble();

        if (isee >= 15000 && isee <= 35000){
            tasse+=1000;
        }
        if (isee > 35000){
            tasse+=1500;
        }


        System.out.print("Inserire anno corso: ");
        int anno = sc.nextInt();

        if (anno == 1){
            System.out.print("Inserire voto diploma in centesimi: ");
            votoDiploma = sc.nextInt();

            if (votoDiploma > 90){
                scolarship = votoDiploma*15;
            }
        } else {
            System.out.print("Inserire media esami in trentesimi: ");
            double mediaEsami = sc.nextDouble();

            sc.nextLine();
            System.out.print("Si e' in pari con gli esami?: ");
            pari = sc.nextLine();

            if ((mediaEsami>26) && pari.equalsIgnoreCase("si")) {
                scolarship = mediaEsami*30;
            }
        }

        System.out.println("\n");

        if (votoDiploma>0) {
            System.out.println("Studente con ISEE pari a: $" + isee + " (Tasse $" + tasse+")");
            System.out.println("Iscritto al " + anno + " anno.");
            System.out.println("Voto diploma: " + votoDiploma + "/100.");
            System.out.println("Borsa di studio: $" + scolarship);
        } else {
            System.out.println("Studente con ISEE pari a: $" + isee + " (Tasse $" + tasse+")");
            System.out.println("Iscritto al " + anno + " anno.");
            System.out.println("Borsa di studio: $" + scolarship);
        }

        if (scolarship-tasse>0){
            System.out.println("Grazie alla tua borsa di studio otterrai un rimborso di: $"+(scolarship-tasse));
        } else {
            System.out.println("Grazie alla tua borsa di studio hai risparmiato $"+scolarship+". Dovrai pagare: $"+(tasse-scolarship)+".");
        }

        sc.close();
        
    }
}
