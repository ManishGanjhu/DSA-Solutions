public class validPalindrome{
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        str= str.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        boolean vp = true;
        for(int i = 0 ; i < str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                vp = false;
            }
        }
        System.out.println(vp);
    }
}