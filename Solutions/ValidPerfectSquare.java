public class ValidPerfectSquare {
    // use two pointer approach 
    public static void main(String[] args) {
        int num =144;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        if(num<1){
            return false;
        }
       long s = 1 ;
       long l = num ;
       while(s<=l){
        long mid = s+(l-s)/2;
        long square = mid*mid;
        if(square==num){
            System.out.println(mid);
            return true;
        }
        if(square<num){
            s = mid+1;
        }else{
            l = mid-1;
        }
       }
       return false;
    }
}
