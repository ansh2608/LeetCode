public class Difference_Between {
    static int[][] onesMinusZeros(int[][] grid) {
        int[] rowOnes = new int[grid.length];
        int[] colOnes = new int[grid[0].length];
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                rowOnes[i] += grid[i][j];
                colOnes[j] += grid[i][j];
            }
        }
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                grid[i][j] = 2 * (rowOnes[i] + colOnes[j]) - grid.length - grid[0].length;
            }
        }
        return grid;
    }
    public static void main(String[] args) {
        int[][] grid = {{0,1,1},{1,0,1},{0,0,1}};
        int[][] ans=onesMinusZeros(grid);
        for (int i=0;i<ans.length;i++){
            for (int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
