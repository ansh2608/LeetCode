public class Transpose_Matrix {
    static int[][] transpose(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int[][] ans = new int[m][n];
        for (int i=0; i<m; i++)
            for (int j=0; j<n; j++)
                ans[i][j] = matrix[j][i];
        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        int[][] ans= transpose(matrix);
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j< matrix[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
