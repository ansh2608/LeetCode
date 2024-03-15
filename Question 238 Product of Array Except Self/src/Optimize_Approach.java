public class Optimize_Approach {
    public static int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] ans=new int[n];
        int mul=1;
        for (int i:nums) mul*=i;
        for (int i=0;i<n;i++) {
            if (mul!=0) ans[i]=mul/nums[i];
            else ans[i]=0;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] num = {-1,1,0,-3,3};
        int[] ans=productExceptSelf(num);
        for (int i:ans) System.out.print(i+" ");
    }
}
