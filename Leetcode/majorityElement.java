public class majorityElement {
    public static void main(String args[]){
        int nums[] = {1,2,1,2,3,1,1,2,2,2,6,7,4,3,3,3};
        System.out.println(leader(nums));
    }
    public static int leader(int nums[]){
        int leader = nums[0];
        int votes = 1 ;
        for(int i  = 1 ; i < nums.length;i++){
            if(nums[i]==leader){
                votes++;
            }else{
                votes--;
            }
            if(votes==0){
                leader= nums[i];
                votes =1;
            }
        }
        return leader;
    }
}
