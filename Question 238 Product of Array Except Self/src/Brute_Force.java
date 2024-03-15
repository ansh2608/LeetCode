public class Brute_Force {
    public static int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] ans=new int[n];
        for (int i=0;i<n;i++){
            int mul=1;
            for (int j=0;j<n;j++) if(i!=j) mul*=nums[j];
            ans[i]=mul;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        int[] ans=productExceptSelf(num);
        for (int i:ans) System.out.print(i+" ");
    }
}
