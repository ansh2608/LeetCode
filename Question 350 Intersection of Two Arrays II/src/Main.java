import java.util.Arrays;

public class Main {
    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] arr=new int[1001];
        int[] result=new int[1001];
        for(int i:nums1) arr[i]++;
        int ctr=0;
        for(int i:nums2){
            if(arr[i]>0){
                result[ctr++]=i;
                arr[i]--;
            }
        }
        return Arrays.copyOfRange(result,0,ctr);
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        int[] ans=intersect(nums1,nums2);
        for(int i:ans) System.out.println(i+" ");
    }
}