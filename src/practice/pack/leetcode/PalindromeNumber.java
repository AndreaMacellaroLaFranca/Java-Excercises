package practice.pack.leetcode;

public class PalindromeNumber {
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
