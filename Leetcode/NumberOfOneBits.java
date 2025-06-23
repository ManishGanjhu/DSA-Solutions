public class NumberOfOneBits {
    public static void main(String args[]){
        //first one is brian Kernighan's Algorithm 

        // int setBits = 0 ;
        // while(n!=0){
        //     n&=(n-1);
        //     setBits++;
        // }
        // return setBits;
        int sb = 0;
        int n = 13;
        String ns = Integer.toBinaryString(n);
        for(char i : ns.toCharArray()){
            if(i=='1'){
                sb++;
            }
        }
        System.out.println(sb);
    }
}
