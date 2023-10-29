public class First_and_Last {
    static int[] find(int[] nums,int target){
        int left = 0, right = nums.length - 1;
        int first = -1, last = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                first = mid;
                last = mid;
                while (first > 0 && nums[first - 1] == target) {
                    first--;
                }
                while (last < nums.length - 1 && nums[last + 1] == target) {
                    last++;
                }
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return new int[]{first, last};
    }
    public static void main(String[] args) {
        int[] arr = {1};
        int x = 1;
        int[] ans=find(arr,x);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}
