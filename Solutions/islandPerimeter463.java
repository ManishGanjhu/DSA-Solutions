public class islandPerimeter463{
    public static void main(String[] args) {
        int matrix[][]={ {0,1,0,0},
                         {1,1,1,0},
                         {0,1,0,0},
                         {1,1,0,0}};
        System.out.println(island(matrix));
    }
    public static int island(int grid[][]){
                int p = 0 ;
        for(int r = 0 ; r < grid.length;r++){
            for(int c = 0 ; c < grid[0].length;c++){
                if(grid[r][c]==1){
                    //check all four sides 
                    //up
                    if(r==0 || grid[r-1][c]==0){
                        p++;
                    }//down
                    if(r==grid.length-1 || grid[r+1][c]==0){
                        p++;
                    }//left
                    if(c==0 || grid[r][c-1]==0){
                        p++;
                    }//right
                    if(c==grid[0].length-1 || grid[r][c+1]==0){
                        p++;
                    }
                }
            }
        }
        return p;
    }
}