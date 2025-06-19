public class searchInasortedMatrix {
    public static void main(String args[]){
        int matrix[][] = { 
                            {1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};
        
           System.out.println(searchMatrix(matrix,13));                                     
    }   
        public static boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length-1;
        while(r<matrix.length&&c>=0){
            if(matrix[r][c]==target){
                System.out.println(r+" "+c);
                return true;
            }else if(target<matrix[r][c]){
                c--;
            }else{
                r++;
            }
        }
        return false;
    }
}
