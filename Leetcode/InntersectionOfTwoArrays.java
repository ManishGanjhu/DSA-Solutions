import java.util.ArrayList;
import java.util.Arrays;

public class InntersectionOfTwoArrays {
    public static void main(String[] args) {
        int nums1[] = {4,9,5};
        int nums2[] = {9,4,9,8,4};
        System.out.println(Arrays.toString(inter(nums1,nums2)));
    }
    public static int[] inter(int nums1[],int nums2[]){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums1.length;i++){
            for(int j = 0 ; j < nums2.length;j++){
                if(nums1[i]==nums2[j] && !list.contains(nums1[i])){
                    list.add(nums1[i]);
                }
            }
        }

        int last[] = new int[list.size()];
        for(int i = 0 ; i < list.size();i++){
            last[i] = list.get(i);
        }
        return last;
    }
}
