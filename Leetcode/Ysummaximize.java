
import java.util.*;
public class Ysummaximize {
    public static void main(String[] args) {
        // int x [] = {1,2,1,3,2};
        // int y [] = {5,3,4,6,2};
        int x[] = {1,2,1,2};
        int y[] = {4,5,6,7};
        int n = x.length;
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i = 0 ; i < n ;i++){
            int key =x[i];
            int value = y[i];

            if(!map.containsKey(key)){
                map.put(key,value);
            }else{
                map.put(key,Math.max(map.get(key),value));
            }
        }
        if(map.size()<3){
            System.out.println(-1);
            return;
        }
        List<Integer> yvalues = new ArrayList<>(map.values());
        Collections.sort(yvalues,Collections.reverseOrder());

        int sum = 0;
        for(int i = 0 ; i < Math.min(3,yvalues.size());i++){
            sum+=yvalues.get(i);
        }
        System.out.println(sum);
    }
}
