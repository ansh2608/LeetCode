public class Main {
    public static int equalSubstring(String s, String t, int maxCost) {
        int ans=0,n=s.length(),window=0,left=0;
        for(int right=0;right<n;right++){
            window+=Math.abs(s.charAt(right)-t.charAt(right));
            while(window>maxCost){
                window -= Math.abs(s.charAt(left)-t.charAt(left));
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "abcd", t = "bcdf";
        int maxCost = 3;
        System.out.println(equalSubstring(s,t,maxCost));
    }
}