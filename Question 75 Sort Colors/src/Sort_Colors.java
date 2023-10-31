public class Sort_Colors {
    static void sort(int[] arr){
        int n=arr.length;
        int lo=0,mid=0,hi=n-1;
        while (mid<=hi){
            if (arr[mid]==0){
                int temp=arr[lo];
                arr[lo]=arr[mid];
                arr[mid]=temp;
                mid++;
                lo++;
            } else if (arr[mid]==1) {
                mid++;
            }
            else {
                int temp=arr[hi];
                arr[hi]=arr[mid];
                arr[mid]=temp;
                hi--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sort(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
