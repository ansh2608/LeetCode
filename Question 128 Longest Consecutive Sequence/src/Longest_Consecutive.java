import java.util.HashSet;

public class Longest_Consecutive {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> st=new HashSet<>();
        int maxStreak=0;
        for (int i:nums) st.add(i);
        for (int i:st){
            if (!st.contains(i-1)){
                int currNum=i,currStreak=1;
                while (st.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                }
                maxStreak=Math.max(maxStreak,currStreak);
            }
        }
        return maxStreak;
    }
    public static void main(String[] args) {
        int[] nums = {5,100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}
