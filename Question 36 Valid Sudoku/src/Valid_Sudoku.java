public class Valid_Sudoku {
    public static boolean isValid(char[][] board,int row,int col,char num){
        // Check Row
        for (int j=0;j< board.length;j++){
            if (board[row][j]==num) return false;
        }
        // Check Column
        for (int i=0;i< board.length;i++){
            if (board[i][col]==num) return false;
        }
        // Check 3X3 Matrix
        int sRow=row/3*3;
        int sCol=col/3*3;
        for (int i=sRow;i<sRow+3;i++){
            for (int j=sCol;j<sCol+3;j++){
                if (board[i][j]==num) return false;
            }
        }
        return true;
    }
    public static boolean isValidSudoku(char[][] board) {
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                if (board[i][j]=='.') continue;
                char num=board[i][j];
                board[i][j]='.';
                if (!isValid(board,i,j,num)) return false;
                board[i][j]=num;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        char[][] board ={   {'5','3','.','.','7','.','.','.','.'},
                            {'6','.','.','1','9','5','.','.','.'},
                            {'.','9','8',',','.','.','.','6','.'},
                            {'8','.','.','.','6','.','.','.','3'},
                            {'4','.','.','8','.','3','.','.','1'},
                            {'7','.','.','.','2','.','.','.','6'},
                            {'.','6','.','.','.','.','2','8','.'},
                            {'.','.','.','4','1','9','.','.','5'},
                            {'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(board));
    }
}
