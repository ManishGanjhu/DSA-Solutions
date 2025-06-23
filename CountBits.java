
import java.util.Arrays;

public class CountBits{
    // prints the set bits of  index no.
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.toString(countSetBits(n)));
    }
    public static int[] countSetBits(int n ){
        int ans[] = new int[n+1];
        for(int i = 0 ; i <=n ;i++){
            ans[i] = Integer.bitCount(i);
        }
        return ans;
    
    }
}