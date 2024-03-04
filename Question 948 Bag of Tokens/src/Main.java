import java.util.Arrays;

public class Main {
    public static int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int s = 0,maxi = 0,l = 0, r = tokens.length - 1;
        while (l <= r) {
            if (power >= tokens[l]) {
                power -= tokens[l];
                s++;
                l++;
                maxi = Math.max(maxi, s);
            } else if (s > 0) {
                power += tokens[r];
                s--;
                r--;
            } else break;
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] tokens = {100};
        int power = 50;
        System.out.println(bagOfTokensScore(tokens,power));
    }
}