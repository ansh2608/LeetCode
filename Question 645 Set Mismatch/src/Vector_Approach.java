public class Vector_Approach {
    public static int[] findErrorNums(int[] nums) {
        int n= nums.length;
        int[] v=new int[n+1];
        int duplicate=0,missing=0;
        for (int i=0;i<n;i++) v[nums[i]]++;
        for (int i=1;i<v.length;i++){
            if (v[i]==2) duplicate=i;
            if (v[i]==0) missing=i;
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
