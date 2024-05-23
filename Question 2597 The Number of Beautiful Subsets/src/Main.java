import java.util.HashMap;

public class Main {
    public static int dfs(int[] nums, int idx, int k, HashMap<Integer, Integer> mp) {
        if (idx == nums.length) return 1;
        int taken = 0;
        if (!mp.containsKey(nums[idx] - k) && !mp.containsKey(nums[idx] + k)) {
            mp.put(nums[idx], mp.getOrDefault(nums[idx], 0) + 1);
            taken = dfs(nums, idx + 1, k, mp);
            mp.put(nums[idx], mp.get(nums[idx]) - 1);
            if (mp.get(nums[idx]) == 0) mp.remove(nums[idx]);
        }
        int notTaken = dfs(nums, idx + 1, k, mp);
        return taken + notTaken;
    }

    public static int beautifulSubsets(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int ans = dfs(nums, 0, k, mp);
        return ans - 1;
    }
    public static void main(String[] args) {
        int[] nums = {2,4,6};
        int k = 2;
        System.out.println(beautifulSubsets(nums,k));
    }
}