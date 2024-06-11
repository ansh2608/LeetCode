public class Main {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int length = 0;
        for(int i:arr1) length = Math.max(length,i);
        int[] count = new int[length+1];
        for(int i:arr1) count[i]++;
        int[] ans = new int[arr1.length];
        int index=0;
        for(int i=0;i<arr2.length;i++){
            while(count[arr2[i]]>0){
                ans[index] = arr2[i];
                index++;
                count[arr2[i]]--;
            }
        }
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                ans[index] = i;
                index++;
                count[i]--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}