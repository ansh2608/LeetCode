public class Optimal_Approach {
    public static int count(String s,int left,int right){
        int count=0;
        while (left>=0 && right<s.length() && s.charAt(left--)==s.charAt(right++)) count++;
        return count;
    }
    public static int countSubstrings(String s){
        int n=s.length(),ans=0;
        for (int i=0;i<n;i++){
            int even=count(s,i,i+1);
            int odd=count(s,i-1,i+1);
            ans+=even+odd+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="abc";
        System.out.println(countSubstrings(s));
    }
}
