import java.util.HashSet;

public class Main {
    public static int findMaxK(int[] nums) {
        HashSet<Integer> st=new HashSet<>();
        int max=Integer.MIN_VALUE;
        for (int num:nums) st.add(num);
        for (int num:nums){
            if(st.contains(-num)) max=Math.max(num,max);
        }
        if(max==Integer.MIN_VALUE) return -1;
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {-1,10,6,7,-7,1};
        System.out.println(findMaxK(nums));
    }
}