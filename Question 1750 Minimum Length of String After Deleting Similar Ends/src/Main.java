public class Main {
    public static int minimumLength(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r && s.charAt(l) == s.charAt(r)) {
            char ch = s.charAt(l);
            while (l <= r && s.charAt(l) == ch) l++;
            while (l <= r && s.charAt(r) == ch) r--;
        }
        return r - l + 1;
    }
    public static void main(String[] args) {
        String s = "aabccabba";
        System.out.println(minimumLength(s));
    }
}