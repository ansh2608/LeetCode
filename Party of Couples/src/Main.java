public class Main {
    static int findSingle(int n, int[] arr){
        int N=0;
        for(int i=0;i<n;i++) N=N^arr[i];
        return N;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 2, 1};
        System.out.println(findSingle(n,arr));
    }
}