public class Main {
    public static int passThePillow(int n, int time) {
        int completed = time/(n-1);
        int remaining = time%(n-1);
        if(completed%2!=0) return (n-remaining);
        return remaining+1;
    }
    public static void main(String[] args) {
        int n = 4, time = 5;
        System.out.println(passThePillow(n,time));
    }
}