public class Search_2D_Matrix_II {
    static boolean search(int[][] matrix, int target){
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int n=matrix.length,m= matrix[0].length;
        int i= 0,j=m-1;
        while (i<n && j>=0){
            if (matrix[i][j]==target) return true;
            if (matrix[i][j]>target) j--;
            else i++;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix= {{-1,3}};
        int target = 99;
        System.out.println(search(matrix,target));
    }
}
