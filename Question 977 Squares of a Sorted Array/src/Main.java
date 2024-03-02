import java.util.Arrays;
public class Main {
    public static int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int st=0,end=n-1;
        for (int i=n-1;i>=0;i--){
            if (Math.abs(nums[st]) >= Math.abs(nums[end])){
                ans[i]=nums[st]*nums[st];
                st++;
            } else {
                ans[i]=nums[end]*nums[end];
                end--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] ans=sortedSquares(nums);
        for (int i:ans) System.out.print(i+" ");
    }
}