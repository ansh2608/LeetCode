public class Brute_Force {
    public static int[] findErrorNums(int[] nums) {
        int duplicate=0,missing=0;
        for (int i=1;i<=nums.length;i++){
            int count=0;
            for (int j=0;j<nums.length;j++) if (nums[j]==i) count++;
            if (count==2) duplicate=i;
            else if (count==0) missing=i;
        }
        return new int[] {duplicate,missing};
    }
    public static void main(String[] args) {
        int[] nums={2,2};
        int[] ans=findErrorNums(nums);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}
