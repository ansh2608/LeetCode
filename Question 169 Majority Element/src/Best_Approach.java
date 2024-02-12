import java.util.*;

public class Best_Approach {
    public static int majorityElement(int[] nums) {
        int count=1,ans=nums[0];
        for (int i=0;i< nums.length;i++){
            if (nums[i]!=ans) count--;
            else count++;
            if (count==0){
                ans=nums[i];
                count=1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
