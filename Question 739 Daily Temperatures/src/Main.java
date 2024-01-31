import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n= temperatures.length;
        Deque<Integer> dq=new ArrayDeque<>();
        int[] ans=new int[n];
        for (int i=n-1;i>=0;i--){
            if (dq.isEmpty()){
                dq.offerFirst(i);
                ans[i]=0;
            }
            while (!dq.isEmpty() && temperatures[i]>=temperatures[dq.peekFirst()]) dq.pollFirst();
            if (dq.isEmpty()) ans[i]=0;
            else ans[i]=dq.peekFirst()-i;
            dq.offerFirst(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] ans=dailyTemperatures(temperatures);
        for (int i:ans) System.out.print(i+" ");
    }
}