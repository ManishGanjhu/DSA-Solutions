public class DoubleExist1346 {
    public static void main(String args[]){
        int arr[] = {7,1,14,10,21};
        System.out.println(check(arr));
    }
    public static boolean check(int arr[]){
        for(int i = 0 ;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(i!=j && arr[i]==(2*arr[j])){
                    return true;
                }
            }
        }
        return false;
    }
}
