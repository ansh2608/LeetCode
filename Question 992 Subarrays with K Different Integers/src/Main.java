public class Main {
    public static int subarraysWithKDistinct(int[] nums, int k) {
        return subarraysWithAtMostKDistinct(nums, k) - subarraysWithAtMostKDistinct(nums, k - 1);
    }
    private static int subarraysWithAtMostKDistinct(int[] nums, int k) {
        int ans = 0;
        int[] count = new int[nums.length + 1];
        for (int l = 0, r = 0; r < nums.length; ++r) {
            if (++count[nums[r]] == 1) --k;
            while (k == -1) if (--count[nums[l++]] == 0) ++k;
            ans += r - l + 1;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,3};
        int k = 2;
        System.out.println(subarraysWithKDistinct(nums,k));
    }
}