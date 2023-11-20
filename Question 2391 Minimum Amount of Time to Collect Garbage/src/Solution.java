public class Solution {
    static int garbageCollection(String[] garbage, int[] travel) {
        int p=0,g=0,m=0,sum=0;
        for (int i=0;i<garbage.length;i++){
            for (char ch:garbage[i].toCharArray()){
                if (ch=='P') p=i;
                else if (ch=='G') g=i;
                else if (ch=='M') m=i;
                sum++;
            }
        }
        for (int i=1;i<travel.length;i++) travel[i]=travel[i]+travel[i-1];
        if (p!=0) sum+=travel[p-1];
        if (m!=0) sum+=travel[m-1];
        if (g!=0) sum+=travel[g-1];
        return sum;
    }
    public static void main(String[] args) {
        String[] garbage = {"MMM","PGM","GP"};
        int[] travel = {3,10};
        System.out.println(garbageCollection(garbage,travel));
    }
}
