import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection2 {
    public static void main(String[] args) {
        int nums1[]={1,2,2,1};
        int nums2[]={2,2};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
    public static int[] intersect(int nums1[],int nums2[]){
                List<Integer> temp=new ArrayList<>();
        
        for(int i = 0 ; i < nums1.length;i++){
            for(int j = 0 ;j< nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    temp.add(nums1[i]);
                    nums2[j]=-1;
                    break;
                }
            }
        }
        int result[] = new int[temp.size()];
        for(int i = 0 ; i < temp.size();i++){
            result[i]=temp.get(i);
        }
        return result;
    }
}
