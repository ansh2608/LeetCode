import java.util.*;
public class Main {
    public static int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int num:nums) mp.put(num,mp.getOrDefault(num,0)+1);
        int count=0,maxFreq=Integer.MIN_VALUE;
        for(int freq:mp.values()) maxFreq=Math.max(maxFreq,freq);
        for (int freq:mp.values()) if (freq==maxFreq) count+=maxFreq;
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(nums));
    }
}