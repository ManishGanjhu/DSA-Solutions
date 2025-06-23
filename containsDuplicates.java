
import java.util.Arrays;

public class containsDuplicates {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,6,3,2,1,1};
        System.out.println(containDuple(nums));
    }
    public static boolean containDuple(int nums[]){
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
