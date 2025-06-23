import java.util.HashMap;
import java.util.Map;

public class countSpecialTriplets {
    /*You are given an integer array nums.

A special triplet is defined as a triplet of indices (i, j, k) such that:

0 <= i < j < k < n, where n = nums.length
nums[i] == nums[j] * 2
nums[k] == nums[j] * 2
Return the total number of special triplets in the array.

Since the answer may be large, return it modulo 109 + 7.

 ©leetcode */
    public static void main(String[] args) {
        int nums[] = {8,4,2,8,4};
        System.out.println(specialTriplets(nums));
    }
    public static int specialTriplets(int[] nums) {
        int mod = 1_000_000_007;
        long count = 0;
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();

        // Fill the right map with frequency of all elements
        for (int num : nums) {
            right.put(num, right.getOrDefault(num, 0) + 1);
        }

        for (int j = 0; j < nums.length; j++) {
            int curr = nums[j];
            int target = curr * 2;

            // Remove current from right (we're using it as middle element now)
            right.put(curr, right.get(curr) - 1);

            int leftCount = left.getOrDefault(target, 0);
            int rightCount = right.getOrDefault(target, 0);

            count = (count + (1L * leftCount * rightCount) % mod) % mod;

            // Add current to left (processed now)
            left.put(curr, left.getOrDefault(curr, 0) + 1);
        }

        return (int) count;

    }
}
