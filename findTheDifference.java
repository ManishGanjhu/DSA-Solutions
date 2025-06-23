import java.util.Arrays;
// this question in sorting section 
public class findTheDifference {
    public static void main(String args[]){
        String s = "";
        String t = "y";
        System.out.println(find(s,t));
    }
    public static char find(String s ,String t){
                char sc [] = s.toCharArray();
        char tc [] = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        int i = 0 ;
        while(i<s.length()){
            if(sc[i]!=tc[i]){
                return tc[i];
            }
            i++;
        }
        return tc[i];
    }
}
