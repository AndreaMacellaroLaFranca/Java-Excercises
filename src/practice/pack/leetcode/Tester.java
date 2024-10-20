package practice.pack.leetcode;

import java.util.Arrays;
import java.util.Scanner;

import static practice.pack.leetcode.RemoveDuplicates.removeDuplicates;
import static practice.pack.leetcode.TwoSum.twoSum;
import static practice.pack.leetcode.PalindromeNumber.isPalindrome;

public class Tester {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(twoSum(nums, 10)));

        System.out.println(isPalindrome(1212));

        int k1 =removeDuplicates(nums);
        System.out.println("Array con duplicati rimossi: " + java.util.Arrays.toString(nums) + ", k = " + k1);
    }
}
