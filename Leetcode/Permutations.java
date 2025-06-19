import java.util.*;
public class Permutations {
    public static void main(String[] args) {
        int nums[]={1,2,3};
        System.out.println(permute(nums));
    }
    public static List<List<Integer>> permute(int nums[]){
        List<List<Integer>> result= new ArrayList<>();
        back(nums,new ArrayList<>(),result);
        return result;
    }
    public static void back(int nums[],List<Integer>current,List<List<Integer>>result){
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i :nums){
            if(current.contains(i)){
                continue;
            }
            current.add(i);
            back(nums,current,result);
            current.remove(current.size()-1);
        }
    }
}
