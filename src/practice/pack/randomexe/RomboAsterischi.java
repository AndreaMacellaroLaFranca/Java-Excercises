package practice.pack.randomexe;

public class RomboAsterischi {
    public static void main(String[] args) {
        int n = 5; // Altezza del rombo

        //soluzione chatgpt

        // Parte superiore del rombo
        for (int i = 0; i < n; i++) {
            // Stampa spazi
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Stampa asterischi
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Parte inferiore del rombo
        for (int i = n - 2; i >= 0; i--) {
            // Stampa spazi
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Stampa asterischi
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}