public class containerWithMostWater {
    //container with most water 
    //two pointer approach
    public static void main(String[] args) {
        int heights[] = {1,8,6,2,5,4,8,3,7};
        int si = 0 ;//left
        int ei = heights.length-1;//right
        int maxWater = 0;
        while(si<=ei){
            int h = Math.min(heights[si],heights[ei]);
            int w = ei-si;
            int water = h*w;
            maxWater = Math.max(water,maxWater);
            if(heights[si]<heights[ei]){
                si++;
            }else{
                ei--;
            }
        }
        System.out.println(maxWater);
    }
}
