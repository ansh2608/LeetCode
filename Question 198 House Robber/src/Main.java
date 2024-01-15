public class Main {
    public static int rob(int[] houses) {
        int n=houses.length,prev=houses[0],prev2=0;
        for (int i=1;i<n;i++){
            int pick=houses[i];
            if (i>1) pick+=prev2;
            int leave=prev;
            int curr=Math.max(pick,leave);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }
}