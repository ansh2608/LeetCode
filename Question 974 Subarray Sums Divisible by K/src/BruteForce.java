public class BruteForce {
    public static int subarraysDivByK(int[] nums, int k) {
        int n=nums.length,count=0;;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++) {
                sum+=nums[j];
                if(sum%k==0) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;
        System.out.println(subarraysDivByK(nums,k));
    }
}
