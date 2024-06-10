import java.util.Arrays;

public class Main {
    public static int heightChecker(int[] heights) {
        int cnt=0,n=heights.length;
        int[] expected=new int[n];
        for(int i=0;i<n;i++) expected[i]=heights[i];
        Arrays.sort(expected);
        for(int i=0;i<n;i++) if(heights[i] != expected[i]) cnt++;
        return cnt;
    }
    public static void main(String[] args) {
        int[] heights = {5,1,2,3,4};
        System.out.println(heightChecker(heights));
    }
}