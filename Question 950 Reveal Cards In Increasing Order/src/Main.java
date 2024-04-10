import java.util.*;

public class Main {
    public static int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> dq = new LinkedList<>();
        int n = deck.length;
        dq.offerFirst(deck[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            int x = dq.pollLast();
            dq.offerFirst(x);
            dq.offerFirst(deck[i]);
        }
        int[] ans = new int[n];
        int index = 0;
        while (!dq.isEmpty()) ans[index++] = dq.pollFirst();
        return ans;
    }
    public static void main(String[] args) {
        int[] deck = {17,13,11,2,3,5,7};
        int[] ans=deckRevealedIncreasing(deck);
        for (int i:ans){
            System.out.print(i+" ");
        }
    }
}