import java.util.Arrays;
public class MissingNumber{
    public static void main(String[] args) {
        int nums[] = {3,0,1};
        int n = nums.length;
        int totalSum = n*(n+1)/2;
        int sum = Arrays.stream(nums).sum();
        System.out.println(totalSum-sum);
    }
}