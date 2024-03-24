public class Main {
    public static int findDuplicate(int[] nums) {
        int mod = (int)1e5 + 1;
        for(int i=0;i<nums.length;i++) {
            int ind = Math.abs(nums[i])%mod;
            if(nums[ind]/mod > 0) return ind;
            nums[ind] += mod;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
}