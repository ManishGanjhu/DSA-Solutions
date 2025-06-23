import java.util.ArrayList;
import java.util.List;

public class MaximumAdjacentSwapsToAlternateParity {
    public static void main(String[] args) {
        int nums[] = {2,4,6,5,7};
        System.out.println(minSwaps(nums));
    }
    public static int minSwaps(int[] nums) {
        // Store positions (indexes) of even and odd numbers
        List<Integer> evenIdx = new ArrayList<>();
        List<Integer> oddIdx = new ArrayList<>();

        // Step 1: Go through the array and find where even and odd numbers are
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenIdx.add(i); // save index if number is even
            } else {
                oddIdx.add(i); // save index if number is odd
            }
        }

        int evenCount = evenIdx.size(); // number of even numbers
        int oddCount = oddIdx.size();   // number of odd numbers

        // Step 2: If difference is too much, we cannot alternate
        if (Math.abs(evenCount - oddCount) > 1) {
            return -1; // Not possible to make even-odd-even...
        }

        int minSwaps = Integer.MAX_VALUE;

        // Step 3: Try starting with even if there are enough even numbers
        if (evenCount >= oddCount) {
            minSwaps = Math.min(minSwaps, calculateSwaps(evenIdx, 0));
        }

        // Step 4: Try starting with odd if there are enough odd numbers
        if (oddCount >= evenCount) {
            minSwaps = Math.min(minSwaps, calculateSwaps(oddIdx, 0));
        }

        return minSwaps; // return the minimum swaps
    }

    // Helper function to calculate total number of swaps
    // 'indices' = list of actual positions of even or odd numbers
    // 'start' = where we expect the first one to be (0, 2, 4,...)
    public static int calculateSwaps(List<Integer> indices, int start) {
        int swaps = 0;

        for (int i = 0; i < indices.size(); i++) {
            int expectedPosition = start + 2 * i;
            int actualPosition = indices.get(i);
            swaps += Math.abs(actualPosition - expectedPosition); // add distance
        }

        return swaps;
    }

}
