import java.util.Arrays;
//merge sorted arrays 
public class mergeSorted {
    public static void main(String args[]){
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int m = 0 ; // no of real elements in nums1
        for(int i : nums1){
            if(i!=0){
                m++;
            }
        }
        // System.out.println(m);
        int n = nums2.length;
        int p1 = m-1;
        int p2 = n-1;
        int p = m+n-1;
        while(p2>=0){
            if( (p1>=0) && nums1[p1]>nums2[p2]){
                nums1[p]=nums1[p1];
                p1--;
            }else{
                nums1[p]=nums2[p2];
                p2--;
            }
            p--;
        }

        
        System.out.println(Arrays.toString(nums1));

    }
}
