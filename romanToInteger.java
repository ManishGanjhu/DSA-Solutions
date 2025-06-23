public class romanToInteger {
    //Roman to integer 
    /*
     * I = 1        IV = 4 , IX = 9
     * V = 5        XL = 40 , XC = 90
     * X = 10       CD = 400 , CM = 900
     * L = 50
     * C = 100
     * D = 500
     * M = 1000
     */
    // logic is if ch1 < chnext subtract the ch1 value else add to the total value
    public static void main(String[] args) {
        String roman = "CM";
        int val[] = new int[roman.length()];
        for(int i = 0 ; i < roman.length();i++){
            char ch = roman.charAt(i);
            if(ch=='I'){
                val[i]=1;
            }else if(ch=='V'){
                val[i]=5;
            }else if(ch=='X'){
                val[i]=10;
            }else if(ch=='L'){
                val[i]=50;
            }else if(ch=='C'){
                val[i] = 100;
            }else if(ch=='D'){
                val[i]=500;  
            } else if(ch=='M'){
                val[i]=1000;
            }
        }
        int integer = 0;
        for(int i = 0 ; i < val.length-1;i++){
            if(val[i]<val[i+1]){
                integer-=val[i];
            }else{
                integer+=val[i];
            }
            
        }
        integer+=val[val.length-1];
        System.out.println(integer);
    }
}
