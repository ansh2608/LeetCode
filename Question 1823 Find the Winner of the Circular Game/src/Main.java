public class Main {
    public static int findTheWinner(int n, int k) {
        int winner=0;
        for (int i = 1; i <= n; i++) winner = (winner + k) % i;
        return winner + 1;
    }
    public static void main(String[] args) {
        int n=5,k=2;
        System.out.println(findTheWinner(n,k));
    }
}