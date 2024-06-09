import java.util.*;

public class Main {
    public static int subarraysDivByK(int[] nums, int k) {
        int count=0,prefixSum=0;
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        for(int num:nums){
            prefixSum += num;
            int mod = prefixSum%k;
            if(mod<0) mod+=k;
            if (mp.containsKey(mod)){
                count += mp.get(mod);
                mp.put(mod,mp.get(mod)+1);
            }
            else mp.put(mod,1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;
        System.out.println(subarraysDivByK(nums,k));
    }
}