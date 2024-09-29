
import java.util.Scanner;

public class StudentSummary {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Inserire classe: ");
        int classe = sc.nextInt();

        System.out.print("Inserire debiti: ");
        int debiti = sc.nextInt();

        System.out.print("Inserire media: ");
        float media = sc.nextFloat();


        float scolarship = 0;
        boolean promoted = true;

        if (debiti<=2 && classe<=4) {
            promoted = true;

        } else if (debiti>0 && classe==5){
            promoted = false;

        } else if (debiti>2) {
            promoted = false;
        }

        if (promoted && media>7 && media<=8){
            scolarship+=1000;
        } else if (promoted && media>8) {
            scolarship+=2000;
        }

        if(promoted && scolarship>0){
            System.out.println("Congratulazioni sei stato promosso con una borsa di studio di: $"+scolarship+"!");
        } else if (promoted && scolarship == 0) {
            System.out.println("Congratulazioni sei stato promosso!");
        } else {
            System.out.println("Sei stato bocciato devi ripertere la " + classe +".");
        }

        sc.close();

    }
}
