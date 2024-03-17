import java.util.*;
public class Main {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int start = newInterval[0], end = newInterval[1];
        boolean inserted = false;
        for (int[] inv : intervals) {
            int cstart = inv[0], cend = inv[1];
            if (cend < start || inserted) {
                ans.add(new int[]{cstart, cend});
                continue;
            }
            start = Math.min(start, cstart);
            if (end < cstart) {
                ans.add(new int[]{start, end});
                ans.add(new int[]{cstart, cend});
                inserted = true;
                continue;
            }
            if (end <= cend) {
                ans.add(new int[]{start, cend});
                inserted = true;
            }
        }
        if (!inserted) ans.add(new int[]{start, end});
        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        int[][] ans=insert(intervals,newInterval);
        for (int i=0;i< ans.length;i++){
            for (int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}