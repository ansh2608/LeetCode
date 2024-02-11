public class Recursion {
    public static int helper(int[][] grid,int row,int robotACol,int robotBCol){
        if(robotACol<0 || robotBCol<0 || robotACol>=grid[0].length || robotBCol>=grid[0].length || row==grid.length) return 0;
        int ans=0;
        ans+=grid[row][robotACol]+grid[row][robotBCol];
        int max=0;
        for(int x=robotACol-1;x<=robotACol+1;x++){
            for(int y=robotBCol-1;y<=robotBCol+1;y++){
                if(x<y) max=Math.max(max,helper(grid,row+1,x,y));
            }
        }
        ans+=max;
        return ans;
    }
    public static int cherryPickup(int[][] grid) {
        int cols=grid[0].length;
        return helper(grid,0,0,cols-1);
    }
    public static void main(String[] args) {
        int[][] grid = {{3,1,1},{2,5,1},{1,5,5},{2,1,1}};
        System.out.println(cherryPickup(grid));
    }
}
