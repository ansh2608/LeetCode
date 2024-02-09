import java.util.*;
public class Main {
    public static List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;
        int[] dp=new int[n];
        int[] prev=new int[n];
        Arrays.fill(dp,1);
        Arrays.fill(prev,-1);
        int maxLen=0,maxIdx=-1;
        for (int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                if (nums[i]%nums[j]==0 && dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                    prev[i]=j;
                }
            }
            if (dp[i]>maxLen){
                maxLen=dp[i];
                maxIdx=i;
            }
        }
        List<Integer> ans=new ArrayList<>();
        while (maxIdx!=-1){
            ans.add(nums[maxIdx]);
            maxIdx=prev[maxIdx];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(largestDivisibleSubset(nums));
    }
}