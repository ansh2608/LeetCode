import java.util.Arrays;

public class Main {
    public static int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char task : tasks) freq[task - 'A']++;
        Arrays.sort(freq);
        int chunk = freq[25] - 1;
        int idle = chunk * n;
        for (int i = 24; i >= 0; i--) idle -= Math.min(chunk, freq[i]);
        return idle < 0 ? tasks.length : tasks.length + idle;
    }
    public static void main(String[] args) {
        char[] tasks = {'A','A','A','B','B','B'};
        int n = 2;
        System.out.println(leastInterval(tasks,n));
    }
}