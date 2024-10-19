package practice.pack.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = {3,2,5,6,5};

        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(twoSum(nums, 10)));

        System.out.println(isPalindrome(1212));


    }

    public static int[] twoSum(int[] nums, int target){
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            // Loop through the rest of the array
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the numbers at index i and j add up to the target
                if (nums[i] + nums[j] == target) {
                    res[0] = i;  // Store index i
                    res[1] = j;   // Return their indices
                }
            }
        }
        return res;
    }

    public static boolean isPalindrome(int x){
        String strNum = Integer.toString(x);  // Convert to string
        String reversedStr = new StringBuilder(strNum).reverse().toString();  // Reverse the string
        if (strNum.equals(reversedStr)){
            return true;
        } else {
            return false;
        }

    }
}
