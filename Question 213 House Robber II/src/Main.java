public class Main {
    public static int f(int[] nums,int lo,int hi){
        int in=0,ex=0;
        for (int i=lo;i<=hi;i++){
            int j=in,e=ex;
            in=e+nums[i];
            ex=Math.max(e,j);
        }
        return Math.max(in,ex);
    }
    public static int rob(int[] nums) {
        int n= nums.length;
        if (n==1) return nums[0];
        return Math.max(f(nums,0,n-2),f(nums,1,n-1));
    }
    public static void main(String[] args) {
        int[] num={1,2,3,1};
        System.out.println(rob(num));
    }
}