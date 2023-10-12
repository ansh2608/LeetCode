class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
public class Remove_Element {
    public static void main(String[] args) {
        Solution obj=new Solution();
        int[] nums={1,2,3,4,5,5,5,6,2,3,5};
        int val=5;
        System.out.println(obj.removeElement(nums,val));
        for (int i=0;i< nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
