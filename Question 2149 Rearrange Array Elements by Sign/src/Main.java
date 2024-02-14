public class Main {
    public static int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int pos = 0, neg = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[pos] = nums[i];
                pos += 2;
            }
            else {
                ans[neg] = nums[i];
                neg += 2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] num = {3,1,-2,-5,2,-4};
        int[] ans= rearrangeArray(num);
        for (int i:ans) System.out.print(i+" ");
    }
}