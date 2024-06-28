import java.util.Arrays;

public class Main {
    public static long maximumImportance(int n, int[][] roads) {
        long res = 0, cost = 1;
        long[] conn = new long[n];
        for (int[] road : roads) {
            conn[road[0]]++;
            conn[road[1]]++;
        }
        Arrays.sort(conn);
        for (long con : conn) res += con * (cost++);
        return res;
    }
    public static void main(String[] args) {
        int n = 5;
        int[][] roads = {{0,1},{1,2},{2,3},{0,2},{1,3},{2,4}};
        System.out.println(maximumImportance(n,roads));
    }
}