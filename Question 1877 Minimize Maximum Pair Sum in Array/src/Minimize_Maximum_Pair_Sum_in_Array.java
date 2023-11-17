import java.util.Arrays;

public class Minimize_Maximum_Pair_Sum_in_Array {
    static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int l=0,r=nums.length-1;
        int minMaxPair=Integer.MIN_VALUE;
        while (l<r){
            int curr=nums[l]+nums[r];
            minMaxPair=Math.max(curr,minMaxPair);
            l++;
            r--;
        }
        return minMaxPair;
    }
    public static void main(String[] args) {
        int[] nums = {3,5,4,2,4,6};
        System.out.println(minPairSum(nums));
    }
}
