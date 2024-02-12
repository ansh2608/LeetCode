import java.util.*;
public class Main {
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int num:nums) mp.put(num,mp.getOrDefault(num,0)+1);
        for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
            if (entry.getValue()>(nums.length/2)) return entry.getKey();
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}