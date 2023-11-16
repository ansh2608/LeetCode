public class Find_Unique_Binary_String {
    static String findDifferentBinaryString(String[] nums) {
        StringBuilder ans=new StringBuilder();
        for (int i=0;i< nums.length;i++) ans.append(nums[i].charAt(i) == '0' ? '1' : '0');
        return ans.toString();
    }
    public static void main(String[] args) {
        String[] nums = {"01","10"};
        System.out.println(findDifferentBinaryString(nums));
    }
}
