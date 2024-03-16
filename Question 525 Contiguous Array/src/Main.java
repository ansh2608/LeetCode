import java.util.*;
public class Main {
    public static int findMaxLength(int[] nums) {
        int n = nums.length,sum = 0,subArrayLength = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += nums[i] == 0 ? -1 : 1;
            if (sum == 0) subArrayLength = i + 1;
            else if (mp.containsKey(sum)) subArrayLength = Math.max(subArrayLength, i - mp.get(sum));
            else mp.put(sum, i);
        }
        return subArrayLength;
    }
    public static void main(String[] args) {
        int[] num = {0,1};
        System.out.println(findMaxLength(num));
    }
}