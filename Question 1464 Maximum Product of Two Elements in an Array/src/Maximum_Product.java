public class Maximum_Product {
    static int maxProduct(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for (int i:nums){
            if (i>=max1){
                max2=max1;
                max1=i;
            }
            else if (i>max2) max2=i;
        }
        return (max1-1)*(max2-1);
        /* My approach
        int n= nums.length-1;
        Arrays.sort(nums);
        return (nums[n]-1)*(nums[n-1]-1);
        */
    }
    public static void main(String[] args) {
        int[] num = {1,5,4,5};
        System.out.println(maxProduct(num));
    }
}
