package practice.pack.leetcode;

public class TwoSum {
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
}
