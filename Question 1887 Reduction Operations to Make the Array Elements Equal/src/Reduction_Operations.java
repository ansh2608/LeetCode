import java.util.Arrays;

public class Reduction_Operations {
    static int reductionOperations(int[] nums) {
        int res=0,sz=nums.length;
        Arrays.sort(nums);
        for (int i=sz-1;i>0;i--) if (nums[i-1] != nums[i]) res+=sz-i;
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {5,1,3};
        System.out.println(reductionOperations(nums));
    }
}
