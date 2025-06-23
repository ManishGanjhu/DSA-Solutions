import java.util.HashMap;

public class pimeFrequency {
    public static void main(String[] args) {
        //check if any element has prime Frequency
        int nums[] = {1,2,3,4,5,4};
        System.out.println( checkPrimeFrequency(nums));
    }
    public static boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int key:map.keySet()){
            if(isPrime(map.get(key))==true){
                return true;
            }
        }
        return false;
    }
    public static boolean isPrime(int n ){
        if(n<=1){
            return false;
        }if(n==2){
            return true;
        }
        for(int i = 2 ; i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
