public class Count_of_Matches {
    static int numberOfMatches(int n) {
        return n-1;
    }
    public static void main(String[] args) {
        int n=7;
        System.out.println(numberOfMatches(numberOfMatches(n)));
    }
}
