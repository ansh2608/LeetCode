public class Minimum_Difficulty {
    public static int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
        if (d > n) return -1;
        int[][] F = new int[d+1][n+1];
        for (int i = 1; i <= n; i++) F[1][i] = Math.max(F[1][i-1], jobDifficulty[i-1]);
        for (int i = 2; i <= d; i++) {
            for (int j = i; j <= n; j++) {
                F[i][j] = Integer.MAX_VALUE;
                int currMax = 0;
                for (int k = j; k >= i; k--) {
                    currMax = Math.max(currMax, jobDifficulty[k-1]);
                    F[i][j] = Math.min(F[i][j], F[i-1][k-1] + currMax);
                }
            }
        }
        return F[d][n];
    }
    public static void main(String[] args) {
        int[] jobDifficulty = {6,5,4,3,2,1};
        int d = 2;
        System.out.println(minDifficulty(jobDifficulty,d));
    }
}
