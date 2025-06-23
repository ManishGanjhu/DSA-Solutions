public class findSqrtWithout {
    public static void main(String args[]){
        int x = 16;
        System.out.println(sqrt(x));
    }
    public static  int sqrt(int x){
        if(x<2){
            return x;
        }
        int l=1;
        int r = x/2;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(mid==(x/mid)){
                return mid;
            }else if(mid<(x/mid)){
                l=mid+1;
            }else{
               r= mid-1;
            }
        }
        return r ;
    }
}
