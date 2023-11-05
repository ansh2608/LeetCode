public class Find_the_Winner_of_an_Array_Game {
    static int getWinner(int[] arr, int k){
        int cur = arr[0];
        int win = 0;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > cur) {
                cur = arr[i];
                win = 0;
            }
            if (++win == k) {
                break;
            }
        }
        return cur;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4,6,7};
        int k = 2;
        System.out.println(getWinner(arr,k));
    }
}
