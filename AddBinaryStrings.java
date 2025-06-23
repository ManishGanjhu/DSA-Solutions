public class AddBinaryStrings {
    public static void main(String args[]){
        String a = "1011";
        String b = "101";
        System.out.println(AddBinary(a,b));
    }
    public static String AddBinary(String a , String b ){
        StringBuilder sb = new StringBuilder("");
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0 ;
        while(i>=0||j>=0||carry>0){
            int bita = (i>=0)?a.charAt(i--)-'0':0;
            int bitb = (j>=0)?b.charAt(j--)-'0':0;
            int sum = bita +bitb+carry;
            sb.append(sum%2);
            carry=sum/2;
        }
        return sb.reverse().toString();
    }
}
