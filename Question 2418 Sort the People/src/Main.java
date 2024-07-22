import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> mp=new HashMap<>();
        for(int i=0;i< names.length;i++) mp.put(heights[i],names[i]);
        Arrays.sort(heights);
        int idx=0;
        for (int i= heights.length-1;i>=0;i--) names[idx++]=mp.get(heights[i]);
        return names;
    }
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        String[] ans=sortPeople(names,heights);
        for(String s:ans) System.out.print(s+" ");
    }
}