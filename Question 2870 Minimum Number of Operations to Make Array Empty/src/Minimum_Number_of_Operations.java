import java.util.HashMap;
import java.util.Map;

public class Minimum_Number_of_Operations {
    public static int minOperations(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int num:nums) mp.put(num,mp.getOrDefault(num,0)+1);
        int count =0;
        for (Map.Entry<Integer,Integer> entry: mp.entrySet()){
            int curr= entry.getValue();
            if (curr==1) return -1;
            count +=curr/3;
            if (curr%3!=0) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,3,2,2,4,2,3,4};
        System.out.println(minOperations(nums));
    }
}
