public class Frog_Jump {
    static boolean canCross(int[] stones){
        int n = stones.length;
        boolean[][] arr = new boolean[n][n + 1];
        arr[0][1] = true;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int jump = stones[i] - stones[j];

                if (jump <= j + 1) {
                    arr[i][jump] = arr[j][jump - 1] || arr[j][jump] || arr[j][jump + 1];
                    if (i == n - 1 && arr[i][jump]) return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] stones={0,1,3,5,6,8,12,17};
        System.out.println(canCross(stones));
    }
}
