import java.util.Arrays;

public class ValidAnagrams {
    public static void main(String[] args) {
        System.out.println(isAnagram("race","care"));
    }
   public static boolean isAnagram(String s, String t) {
        char sc[] = s.toCharArray();
        char tc[] = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        if(Arrays.equals(sc,tc)){
            return true;
        }
        return false;
}
}