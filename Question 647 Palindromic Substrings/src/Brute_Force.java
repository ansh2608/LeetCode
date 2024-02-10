public class Brute_Force {
    public static boolean isPalindrome(String s,int left,int right){
        while (left<right) if (s.charAt(left++)!=s.charAt(right--)) return false;
        return true;
    }
    public static int countSubstrings(String s) {
        int n=s.length(),ans=0;
        for (int i=0;i<n;i++) for (int j=i;j<n;j++) if (isPalindrome(s,i,j)) ans++;
        return ans;
    }
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(countSubstrings(s));
    }
}
