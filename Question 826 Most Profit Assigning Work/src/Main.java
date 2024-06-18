public class Main {
    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxDif = 0;
        for (int d : difficulty) maxDif = Math.max(maxDif, d);
        int[] maxProfit = new int[maxDif + 1];
        for (int i = 0; i < difficulty.length; i++) maxProfit[difficulty[i]] = Math.max(maxProfit[difficulty[i]], profit[i]);
        for (int i = 1; i <= maxDif; i++) maxProfit[i] = Math.max(maxProfit[i], maxProfit[i - 1]);
        int totalProfit = 0;
        for (int ability : worker) {
            if (ability > maxDif) totalProfit += maxProfit[maxDif];
            else totalProfit += maxProfit[ability];
        }
        return totalProfit;
    }
    public static void main(String[] args) {
        int[] difficulty = {2,4,6,8,10}, profit = {10,20,30,40,50}, worker = {4,5,6,7};
        System.out.println(maxProfitAssignment(difficulty,profit,worker));
    }
}