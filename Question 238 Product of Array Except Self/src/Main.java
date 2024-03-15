import java.util.Arrays;

public class Main {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 0);
        int product = 1;
        int zeros = 0;
        for (int num : nums) {
            if (num == 0) {
                zeros++;
                continue;
            }
            product *= num;
        }
        if (zeros == 1) for (int i = 0; i < n; i++) ans[i] = nums[i] == 0 ? product : 0;
        else if (zeros == 0) for (int i = 0; i < n; i++) ans[i] = product / nums[i];
        return ans;
    }
    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        int[] ans=productExceptSelf(num);
        for (int i:ans) System.out.print(i+" ");
    }
}