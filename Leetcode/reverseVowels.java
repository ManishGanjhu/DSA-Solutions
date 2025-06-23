public class reverseVowels {
    public static void main(String[] args) {
        
    }
}
/*
 * class Solution {
    public String reverseVowels(String s) {
        char sc[] = s.toCharArray();
        int si = 0 ;
        int ei = sc.length-1;
        while(si<ei){
        if ((sc[si] == 'a' || sc[si] == 'e' || sc[si] == 'i' || sc[si] == 'o' || sc[si] == 'u' ||
     sc[si] == 'A' || sc[si] == 'E' || sc[si] == 'I' || sc[si] == 'O' || sc[si] == 'U') &&
    (sc[ei] == 'a' || sc[ei] == 'e' || sc[ei] == 'i' || sc[ei] == 'o' || sc[ei] == 'u' ||
     sc[ei] == 'A' || sc[ei] == 'E' || sc[ei] == 'I' || sc[ei] == 'O' || sc[ei] == 'U')) {
    char temp = sc[si];
    sc[si] = sc[ei];
    sc[ei] = temp;

    si++;
    ei--;
     }
     else if(!(sc[si] == 'a' || sc[si] == 'e' || sc[si] == 'i' || sc[si] == 'o' || sc[si] == 'u' ||
     sc[si] == 'A' || sc[si] == 'E' || sc[si] == 'I' || sc[si] == 'O' || sc[si] == 'U')){
        si++;
     }else{
        ei--;
     }
        }
        return new String(sc);
    
    }
}
 */
