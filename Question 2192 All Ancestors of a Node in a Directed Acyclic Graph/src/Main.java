import java.util.*;

public class Main {
    public static List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> ans = new ArrayList();
        List<List<Integer>> dc = new ArrayList();
        for (int i = 0; i < n; i++) {
            ans.add(new ArrayList());
            dc.add(new ArrayList());
        }
        for (int[] e: edges) dc.get(e[0]).add(e[1]);
        for (int i = 0; i < n; i++) dfs(i, i, ans, dc);
        return ans;
    }
    private static void dfs(int x, int curr, List<List<Integer>> ans, List<List<Integer>> dc) {
        for (int ch: dc.get(curr))
            if(ans.get(ch).size() == 0 || ans.get(ch).get(ans.get(ch).size() - 1) != x) {
                ans.get(ch).add(x);
                dfs(x, ch, ans, dc);
            }
    }
    public static void main(String[] args) {
        int n = 8;
        int[][] edgeList = {{0,3},{0,4},{1,3},{2,4},{2,7},{3,5},{3,6},{3,7},{4,6}};
        System.out.println(getAncestors(n,edgeList));
    }
}