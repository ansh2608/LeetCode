public class power_two {
    static boolean isPowerOfTwo(int n){
        if (n==1) return true;
        else if (n%2!=0 || n==0) return false;
        return isPowerOfTwo(n/2);
    }
    public static void main(String[] args) {
        int n=8;
        boolean ans=isPowerOfTwo(n);
        System.out.print(ans);
    }
}
