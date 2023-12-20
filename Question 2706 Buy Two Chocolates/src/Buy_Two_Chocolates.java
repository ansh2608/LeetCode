public class Buy_Two_Chocolates {
    static int buyChoco(int[] prices, int money) {
        int first_min=Integer.MAX_VALUE;
        int second_min=Integer.MAX_VALUE;
        for (int i:prices){
            if (i<first_min){
                second_min=first_min;
                first_min=i;
            }
            else second_min=Math.min(second_min,i);
        }
        int left=money-(first_min+second_min);
        return left>=0 ? left:money;
    }
    public static void main(String[] args) {
        int[] prices = {3,2,3};
        int money = 3;
        System.out.println(buyChoco(prices,money));
    }
}
