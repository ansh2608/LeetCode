public class Minimum_Time {
    public static int minCost(String colors, int[] neededTime) {
        int n=colors.length();
        int res=0;
        for (int i=1;i<n;i++){
            if (colors.charAt(i)==colors.charAt(i-1)){
                res+=Math.min(neededTime[i],neededTime[i-1]);
                neededTime[i]=Math.max(neededTime[i],neededTime[i-1]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String colors = "abaac";
        int[] neededTime = {1,2,3,4,5};
        System.out.println(minCost(colors,neededTime));
    }
}
