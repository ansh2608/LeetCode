public class Main {
    public static int climbStairs(int n) {
        if (n==0 || n==1) return 1;
        int pp=1,p=1;
        for (int i=2;i<=n;i++) {
            int curr=p+pp;
            pp=p;
            p=curr;
        }
        return p;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(climbStairs(n));
    }
}