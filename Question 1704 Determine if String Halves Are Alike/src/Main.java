public class Main {
    public static boolean halvesAreAlike(String s) {
        int n=s.length();
        s=s.toLowerCase();
        String a=s.substring(0,n/2);
        String b=s.substring(n/2,n);
        int a_vow_count=0,b_vow_count=0;
        for (int i=0;i<n/2;i++){
            char a_curr=a.charAt(i);
            char b_curr=b.charAt(i);
            if (a_curr=='a' || a_curr=='e' || a_curr=='i' || a_curr=='o' || a_curr=='u') a_vow_count++;
            if (b_curr=='a' || b_curr=='e' || b_curr=='i' || b_curr=='o' || b_curr=='u') b_vow_count++;
        }
        if (a_vow_count==b_vow_count) return true;
        return false;
    }
    public static void main(String[] args) {
        String s="book";
        System.out.println(halvesAreAlike(s));
    }
}