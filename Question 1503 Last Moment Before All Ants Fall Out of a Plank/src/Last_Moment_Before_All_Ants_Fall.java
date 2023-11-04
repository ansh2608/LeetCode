public class Last_Moment_Before_All_Ants_Fall {
    static int getLastMoment(int n, int[] left, int[] right){
        int i= 0;
        for (int j:left) i=Math.max(i,j);
        for (int j:right) i=Math.max(i,n-j);
        return i;
    }
    public static void main(String[] args) {
        int n = 7;
        int[] left = {};
        int[] right = {0,1,2,3,4,5,6,7};
        System.out.println(getLastMoment(n,left,right));
    }
}
