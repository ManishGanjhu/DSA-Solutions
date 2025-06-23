public class clearDigits{
    public static void main(String args[]){
        String s = "cb34";
        StringBuilder sb = new StringBuilder("");
        int i = 0;
        while(i<s.length()){
            if(Character.isLetter(s.charAt(i))){
                sb.append(s.charAt(i));
            }else{
                sb.deleteCharAt(sb.length()-1);
            }
            i++;
        }
        System.out.println(sb.toString());
    }
}