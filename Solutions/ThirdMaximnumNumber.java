
import java.util.Arrays;

public class ThirdMaximnumNumber {
    public static void main(String args[]){
        int nums[]={3,2,0,-1};
        System.out.println(thirdMax(nums));
    }
    public static int thirdMax(int nums[]){
        Arrays.sort(nums);
           int count = 1 ;
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i]!=nums[i+1]){
                count++;
            }if(count==3){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    
    }
}
