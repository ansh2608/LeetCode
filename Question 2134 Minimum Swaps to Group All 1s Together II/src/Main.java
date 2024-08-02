public class Main {
    public static int minSwaps(int[] nums) {
        int n = nums.length;
        int total = 0;
        for (int num : nums) total += num;
        int[] extendedNums = new int[2 * n];
        System.arraycopy(nums, 0, extendedNums, 0, n);
        System.arraycopy(nums, 0, extendedNums, n, n);
        int[] prefix = new int[2 * n + 1];
        for (int i = 0; i < 2 * n; i++) prefix[i + 1] = prefix[i] + extendedNums[i];
        int biggestOnes = 0;
        for (int i = 0; i < n; i++) biggestOnes = Math.max(biggestOnes, prefix[i + total] - prefix[i]);
        return total - biggestOnes;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,1,1,0,0};
        System.out.println(minSwaps(nums));
    }
}