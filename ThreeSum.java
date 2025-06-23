import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String args[]){
        // find three sum 
        int nums[] = {-1,0,1,2,-1,-4};
        System.out.println(tsm(nums));

    }
        public static List<List<Integer>> tsm(int[] nums) {
        List<List<Integer>> teams = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-2;i++){
            // skip the repeated to avoid duplicates
            if(i>0 && nums[i-1]==nums[i] ){
                continue;
            }
            int s = i+1;
            int e = nums.length-1;
            while(s<e){
                int sum = nums[i]+nums[s]+nums[e];
                if(sum==0){
                    teams.add(Arrays.asList(nums[i],nums[s],nums[e]));
                    // Move pointers and skip duplicates
                    while (s < e && nums[s] == nums[s + 1]){
                        s++;
                    }
                    while (s < e && nums[e] == nums[e - 1]){
                        e--;
                    }

                    s++;
                    e--;
                }else if(sum<0){
                    s++;
                }else{
                    e--;
                }
            }
        }
        return teams;
    }
}
/*class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);  // Step 1: Sort the array

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate values for 'i'
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int s = i + 1;
            int e = nums.length - 1;

            while (s < e) {
                int sum = nums[i] + nums[s] + nums[e];

                if (sum == 0) {
                    triplets.add(Arrays.asList(nums[i], nums[s], nums[e]));

                    // Move pointers and skip duplicates
                    while (s < e && nums[s] == nums[s + 1]) s++;
                    while (s < e && nums[e] == nums[e - 1]) e--;

                    s++;
                    e--;
                } else if (sum < 0) {
                    s++;
                } else {
                    e--;
                }
            }
        }

        return triplets;
    }
}
*/ 