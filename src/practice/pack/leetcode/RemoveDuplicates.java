package practice.pack.leetcode;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int j = 1;  // Puntatore per il numero di elementi unici

        // Scorriamo l'array a partire dal secondo elemento
        for (int i = 1; i < nums.length; i++) {
            // Se troviamo un numero diverso dal precedente
            if (nums[i] != nums[i - 1]) {
                // Inseriamo il valore unico nella posizione j
                nums[j] = nums[i];
                j++;
            }
        }

        return j; // Numero di elementi unici (k)
    }
}
