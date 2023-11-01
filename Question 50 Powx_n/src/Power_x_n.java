public class Power_x_n {
    static double myPow(double x,int n){
//        if (n==1) return x;
//        return x*pow(x,n-1);
        if(n < 0){
            n = -n;
            x = 1 / x;
        }
        double pow = 1;
        while(n != 0){
            if((n & 1) != 0){
                pow *= x;
            }
            x *= x;
            n >>>= 1;
        }
        return pow;
    }
    public static void main(String[] args) {
        double x=2.0000;
        int n=-2;
        System.out.println(myPow(x,n));
    }
}
