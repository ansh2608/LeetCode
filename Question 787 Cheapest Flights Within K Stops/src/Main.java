import java.util.*;
public class Main {
    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, List<int[]>> adj = new HashMap<>();
        for (int[] flight : flights) adj.computeIfAbsent(flight[0], key -> new ArrayList<>()).add(new int[] {flight[1], flight[2]});
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {src, 0});
        int stops = 0;
        while (!q.isEmpty() && stops <= k) {
            int sz = q.size();
            while (sz-- > 0) {
                int[] curr = q.poll();
                int node = curr[0];
                int distance = curr[1];
                if (!adj.containsKey(node)) continue;
                for (int[] next : adj.get(node)) {
                    int neighbour = next[0];
                    int price = next[1];
                    if (price + distance >= dist[neighbour]) continue;
                    dist[neighbour] = price + distance;
                    q.offer(new int[] {neighbour, dist[neighbour]});
                }
            }
            stops++;
        }
        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
    public static void main(String[] args) {
        int n = 4,src = 0, dst = 3, k = 1;
        int[][] flights = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        System.out.println(findCheapestPrice(n,flights,src,dst,k));
    }
}