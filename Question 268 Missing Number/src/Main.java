import java.util.Arrays;

public class Main {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (nums[0] != 0) return 0;
        if (nums[n - 1] != n) return n;
        for (int i = 1; i < nums.length; i++) if (nums[i] != i) return i;
        return 0;
    }
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
}