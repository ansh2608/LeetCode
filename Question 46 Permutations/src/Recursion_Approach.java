import java.util.*;
public class Recursion_Approach {
    static void helper(int[] nums,int idx,List<List<Integer>> ans){
        if (idx== nums.length-1){
            List<Integer> list=new ArrayList<>();
            for (int i=0;i<nums.length;i++) list.add(nums[i]);
            ans.add(list);
            return;
        }
        for (int i=idx;i< nums.length;i++){
            swap(i,idx,nums);
            helper(nums,idx+1,ans);
            swap(i,idx,nums);
        }
    }
    static void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(nums,0,ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans=permute(nums);
        System.out.println(ans);
    }
}
