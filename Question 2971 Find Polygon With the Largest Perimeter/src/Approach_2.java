import java.util.Arrays;

public class Approach_2 {
    public static long largestPerimeter(int[] nums) {
        long sum=0,ans=-1;
        Arrays.sort(nums);
        for (int num:nums){
            if(num<sum) ans=num+sum;
            sum+=num;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,12,1,2,5,50,3};
        System.out.println(largestPerimeter(nums));
    }
}
