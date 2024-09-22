public class Main {
    public int findKthNumber(int n, int k) {
        int currentPrefix = 1;
        k--;
        while (k > 0) {
            int count = countNumbersWithPrefix(currentPrefix, n);
            if (k >= count) {
                currentPrefix++;
                k -= count;
            } else {
                currentPrefix *= 10;
                k--;
            }
        }
        return currentPrefix;
    }
    private int countNumbersWithPrefix(int prefix, int n) {
        long firstNumber = prefix, nextNumber = prefix + 1;
        int totalCount = 0;
        while (firstNumber <= n) {
            totalCount += Math.min(n + 1, nextNumber) - firstNumber;
            firstNumber *= 10;
            nextNumber *= 10;
        }
        return totalCount;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}