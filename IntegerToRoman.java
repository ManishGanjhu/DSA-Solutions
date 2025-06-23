public class IntegerToRoman {
    public static void main(String args[]){
        int num = 2025;
        System.out.println(toRoman(num));
    }
    public static String toRoman(int num){

        int val[] = {1000,900, 500, 400, 100, 90,  50,  40, 10, 9, 5, 4, 1};
        String roman[] ={"M","CM","D", "CD","C", "XC","L", "XL","X","IX","V","IV","I"};
        
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i < val.length;i++){
            while(num>=val[i]){
                sb.append(roman[i]);
                num-=val[i];
            }
        }
        return sb.toString();
    }
}
