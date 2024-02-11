import java.util.Arrays;

public class Main {
    public static int cherryPickup(int[][] grid) {
        int rows= grid.length,cols=grid[0].length,ans=0;
        int[][][] dp=new int[rows][cols][cols];
        for (int i=0;i<rows;i++)
            for (int j=0;j<cols;j++)
                Arrays.fill(dp[i][j],-1);
        dp[0][0][cols-1]=grid[0][0]+grid[0][cols-1];
        for(int i=1;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                for(int k=j+1;k<cols;k++) {
                    int max = -1;
                    for(int x=-1;x<=1;x++) {
                        for(int y=-1;y<=1;y++) {
                            if(j+x >= 0 && j+x < cols && k+y >= 0 && k+y < cols)
                                max = Math.max(
                                        max,
                                        dp[i-1][j+x][k+y]
                                );
                        }
                    }
                    if(max != -1)
                        dp[i][j][k] = max + grid[i][j] + grid[i][k];
                    if(ans < dp[i][j][k]) ans = dp[i][j][k];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] grid = {{3,1,1},{2,5,1},{1,5,5},{2,1,1}};
        System.out.println(cherryPickup(grid));
    }
}