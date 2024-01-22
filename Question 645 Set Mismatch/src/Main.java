public class Main {
    public static int[] findErrorNums(int[] nums) {
        int[] ans=new int[2];
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]!=i+1){
                ans[0]=nums[i];
                ans[1]=nums[i]+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={2,2};
        int[] ans=findErrorNums(nums);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}