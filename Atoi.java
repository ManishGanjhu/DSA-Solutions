

public class Atoi{
    public static void main(String[] args) {
        String s = "0-1";
        String newS = s.replaceAll("[a-zA-z]","").trim();
        // int n = Integer.parseInt(s.trim());
        System.out.println(Integer.parseInt(newS));        
    }
}