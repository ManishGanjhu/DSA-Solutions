public class searchRotated{
    // Search in Rotated sorted array 
    public static void main(String args[]){
        int arr[] = {3,1};
        int target = 1 ;
        int si = 0 ; 
        int ei = arr.length-1;

        while(si<=ei){
            int mid = si+(ei-si)/2;
            if(arr[mid]==target){
                System.out.println(mid);
            }
           if(arr[si]<=arr[mid]){ // left part is sorted
            //value of si and ei depends on target presence
                if(arr[si]<=target && target < arr[mid]){
                    ei = mid-1;
                }else{
                    si = mid+1;
                }
           }else{
            if(arr[mid]<target && target<=arr[ei]){
                si = mid+1;
            }else{
                ei = mid-1;
            }
           }
        }
    }
   
}