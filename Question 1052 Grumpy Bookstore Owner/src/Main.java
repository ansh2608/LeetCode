public class Main {
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = grumpy.length, i = 0, curWin = 0, maxWin = 0;
        for(int j=0;j<n;j++) {
            curWin+=customers[j] * grumpy[j];
            maxWin = Math.max(curWin, maxWin);
            if(j >= minutes - 1 ) curWin -= customers[i] * grumpy[i++];
        }
        int res = maxWin;
        for(i=0;i<grumpy.length;i++) res+=customers[i] * (1 - grumpy[i]);
        return res;
    }
    public static void main(String[] args) {
        int[] customers = {1,0,1,2,1,1,7,5}, grumpy = {0,1,0,1,0,1,0,1};
        int minutes = 3;
        System.out.println(maxSatisfied(customers,grumpy,minutes));
    }
}