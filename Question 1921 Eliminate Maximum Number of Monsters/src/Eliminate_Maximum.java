import java.util.Arrays;

public class Eliminate_Maximum {
    static int eliminateMaximum(int[] dist, int[] speed){
        for (int i=0;i< dist.length;i++) dist[i]=(dist[i]-1)/speed[i];
        Arrays.sort(dist);
        for (int i=0;i< dist.length;i++) if (i>dist[i]) return i;
        return dist.length;
    }
    public static void main(String[] args) {
        int[] dist = {1,3,4};
        int[] speed = {1,1,1};
        System.out.println(eliminateMaximum(dist,speed));
    }
}
