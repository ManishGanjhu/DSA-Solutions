
import java.util.Arrays;

public class moveZeros {
    public static void main(String args[]){
        int nums[] = {0,1,0,3,12};
        move(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void move(int nums[]){
        int temp[] = new int[nums.length];
        int i = 0 ;
        int j = 0 ;
        while(i<nums.length){
            if(nums[i]!=0){
                temp[j]=nums[i];
                j++;
            }
            i++;
        }
        while(j<nums.length){
            temp[j++] = 0;
        }
        for( i = 0 ; i < nums.length;i++){
            nums[i]=temp[i];
        }
    }
}
