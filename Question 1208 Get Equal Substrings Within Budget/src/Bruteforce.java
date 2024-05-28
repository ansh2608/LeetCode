public class Bruteforce {
    public static int equalSubstring(String s, String t, int maxCost) {
        String ans="";
        int sum=0;
        for(int i=0;i<s.length();i++){
            int x=s.charAt(i);
            int y=t.charAt(i);
            int diff=Math.abs(x-y);
            sum+=diff;
            if(sum>maxCost) break;
            ans+=t.charAt(i);
        }
        return ans.length();
    }
    public static void main(String[] args) {
        String s = "abcd", t = "bcdf";
        int maxCost = 3;
        System.out.println(equalSubstring(s,t,maxCost));
    }
}
