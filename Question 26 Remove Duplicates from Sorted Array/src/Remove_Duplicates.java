public class Remove_Duplicates {
    static int remove(int[] arr){
        int j=0;
        for (int i=0;i<arr.length;i++){
            if (arr[j]!=arr[i]){
                arr[++j]=arr[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        int[] num = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(remove(num));
    }
}
