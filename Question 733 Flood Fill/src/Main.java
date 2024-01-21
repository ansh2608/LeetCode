public class Main {
    public static void helper(int sr,int sc,int[][] image,int[][] ans,int newColor,int[] delRow,int[] delCol,int inColor){
        int n= image.length,m=image[0].length;
        ans[sr][sc]=newColor;
        for (int i=0;i<4;i++){
            int row=sr+delRow[i];
            int col=sc+delCol[i];
            if (row>=0 && row<n && col>=0 && col<m && image[row][col]==inColor && ans[row][col]!=newColor){
                helper(row,col,image,ans,newColor,delRow,delCol,inColor);
            }
        }
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int inColor=image[sr][sc];
        int[][] ans=image;
        int[] delRow={-1,0,1,0};
        int[] delCol={0,1,0,-1};
        helper(sr,sc,image,ans,newColor,delRow,delCol,inColor);
        return ans;
    }
    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, newColor = 2;
        int[][] ans=floodFill(image,sr,sc,newColor);
        for (int i=0;i< ans.length;i++){
            for (int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}