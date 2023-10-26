public class Search_Insert_Position {
    static int search(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid-1;
            else start = mid+1;
        }

        return start;
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        int x=7;
        int ans=search(arr,x);
        System.out.println(ans);
    }
}
