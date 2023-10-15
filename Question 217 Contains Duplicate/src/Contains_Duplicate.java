import java.util.Arrays;

public class Contains_Duplicate {
    public static void main(String[] args) {

        int[] nums={1,2,3};

        /* Bruteforce
        boolean ans=false;
        for (int i=0;i< nums.length;i++){
            for (int j=i+1;j< nums.length;j++){
                if (nums[i]==nums[j]) ans=true;
            }
        }
        System.out.println(ans);

         */
        Arrays.sort(nums);
        for (int i=1;i< nums.length;i++) {
            if (nums[i] == nums[i - 1]) System.out.println("True");
            else System.out.println("false");
        }
    }
}
