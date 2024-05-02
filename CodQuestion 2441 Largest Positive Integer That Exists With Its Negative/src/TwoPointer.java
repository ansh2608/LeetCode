import java.util.Arrays;
import java.util.HashSet;

public class TwoPointer {
    public static int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int l=0,r=nums.length-1,max=Integer.MIN_VALUE;
        while (l<r){
            int sum=nums[l]+nums[r];
            if (sum==0){
                max=Math.max(max,nums[r]);
                l++;
                r--;
            }
            else if (sum<0) l++;
            else r--;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {-1,10,6,7,-7,1};
        System.out.println(findMaxK(nums));
    }
}
