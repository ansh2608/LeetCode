import java.util.Arrays;

public class Main {
    public static boolean canBeEqual(int[] target, int[] arr) {
        int[] cnt1=new int[1001], cnt2=new int[1001];
        for(int i:target) ++cnt1[i];
        for(int i:arr) ++cnt2[i];
        return Arrays.equals(cnt1,cnt2);
    }
    public static void main(String[] args) {
        int[] target = {1,2,2,3}, arr = {1,1,2,3};
        System.out.println(canBeEqual(target,arr));
    }
}