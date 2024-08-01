import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> spirallyTraverse(int[][] matrix) {
        ArrayList<Integer> ans=new ArrayList<>();
        if(matrix.length==0) return ans;
        int rowBegin=0,rowEnd= matrix.length-1;
        int colBegin=0,colEnd= matrix[0].length-1;
        while(rowBegin<=rowEnd && colBegin<=colEnd){
            //Traverse Right
            for(int j=colBegin;j<=colEnd;j++) ans.add(matrix[rowBegin][j]);
            rowBegin++;
            //Traverse Down
            for(int i=rowBegin;i<=rowEnd;i++) ans.add(matrix[i][colEnd]);
            colEnd--;
            //Traverse Left
            if(rowBegin<=rowEnd){
                for(int j=colEnd;j>=colBegin;j--) ans.add(matrix[rowEnd][j]);
                rowEnd--;
            }
            //Traverse Up
            if(colBegin<=colEnd){
                for(int i=rowEnd;i>=rowBegin;i--) ans.add(matrix[i][colBegin]);
                colBegin++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix = {  {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15,16}     };
        System.out.println(spirallyTraverse(matrix));
    }
}