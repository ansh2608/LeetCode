import java.util.Arrays;

public class Main {
    public static int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
            dist[i][i] = 0;
        }
        for (int[] edge : edges) {
            dist[edge[0]][edge[1]] = edge[2];
            dist[edge[1]][edge[0]] = edge[2];
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] < Integer.MAX_VALUE && dist[k][j] < Integer.MAX_VALUE) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }
        int ansNode = -1;
        int cityCnt = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (dist[i][j] <= distanceThreshold && i != j) cnt++;
            }
            if (cnt < cityCnt) {
                ansNode = i;
                cityCnt = cnt;
            }
        }
        return ansNode;
    }
    public static void main(String[] args) {
        int n = 4, distanceThreshold = 4;
        int[][] edges = {{0,1,3},{1,2,1},{1,3,4},{2,3,1}};
        System.out.println(findTheCity(n,edges,distanceThreshold));
    }
}