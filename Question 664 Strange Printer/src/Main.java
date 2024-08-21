import java.util.Arrays;

public class Main {
    public static int helper(int i, int j, char[] sChar,int[][] dp){
        if(i>j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int firstLetter = sChar[i];
        int answer = 1+helper(i+1,j,sChar,dp);
        for(int k=i+1;k<=j;k++){
            if(sChar[k] == firstLetter){
                int betterAnswer = helper(i,k-1,sChar,dp) + helper(k+1,j,sChar,dp);
                answer = Math.min(answer,betterAnswer);
            }
        }
        return dp[i][j] = answer;
    }
    public static int strangePrinter(String s){
        int n=s.length();
        char[] sChar=s.toCharArray();
        int[][] dp=new int[n][n];
        for(int[] i: dp) Arrays.fill(i,-1);
        return helper(0,n-1,sChar,dp);
    }
    public static void main(String[] args) {
        String s = "aaabbb";
        System.out.println(strangePrinter(s));
    }
}