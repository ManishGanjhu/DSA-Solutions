public class powerofFour {
    // checks if n is power of 4 
    public static void main (String args[]){
        System.out.println(four(4));
    }
    public static boolean  four(int n ){
        return n>0 && (n&(n-1))==0 && n%3==1;
    }
}
