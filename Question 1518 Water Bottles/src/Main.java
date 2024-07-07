public class Main {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int totalBottles = numBottles;
        while (numBottles >= numExchange) {
            totalBottles += numBottles / numExchange;
            numBottles = (numBottles / numExchange) + (numBottles % numExchange);
        }

        return totalBottles;
    }
    public static void main(String[] args) {
        int numBottles=9;
        int numExchange=3;
        System.out.println(numWaterBottles(numBottles,numExchange));
    }
}