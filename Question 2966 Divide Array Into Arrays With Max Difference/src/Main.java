import java.util.Arrays;
public class Main {
    public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] result = new int[0][0];
        for (int i = 0; i + 2 < nums.length; ++i) {
            if (i % 3 == 0) {
                if (nums[i + 2] - nums[i] <= k) {
                    int[] triplet = {nums[i], nums[i + 1], nums[i + 2]};
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = triplet;
                }
                else return new int[0][0];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,8,7,9,3,5,1};
        int k = 2;
        int[][] ans=divideArray(nums,k);
        for (int i=0;i<ans.length;i++){
            for (int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}