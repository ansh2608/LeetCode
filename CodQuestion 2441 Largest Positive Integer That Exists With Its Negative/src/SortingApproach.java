import java.util.Arrays;

public class SortingApproach {
    public static int findMaxK(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for (int i=n-1;i>=0;i--){
            if (nums[i]>0 && Arrays.binarySearch(nums,-nums[i])>=0) return nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {-1,10,6,7,-7,1};
        System.out.println(findMaxK(nums));
    }
}
