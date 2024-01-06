import java.util.*;
public class Maximum_Profit {
    public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int len=startTime.length;
        int[][] dp = new int[len][3];
        for(int i=0; i<len; i++) dp[i] = new int[]{startTime[i], endTime[i], profit[i]};
        Arrays.sort(dp, (a,b)->a[1]-b[1]);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(0, 0);
        for(var i:dp){
            int cur = map.floorEntry(i[0]).getValue() + i[2];
            if(cur > map.lastEntry().getValue()) map.put(i[1], cur);
        }
        return map.lastEntry().getValue();
    }
    public static void main(String[] args) {
        int[] startTime = {1,2,3,4,6};
        int[] endTime = {3,5,10,6,9};
        int[] profit = {20,20,100,70,60};
        System.out.println(jobScheduling(startTime,endTime,profit));
    }
}
