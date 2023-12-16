public class Merge_Sorted_Array {
    static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,k=m+n-1;
        while (j>=0){
            if (i>=0 && nums1[i]>nums2[j]) nums1[k--]=nums1[i--];
            else nums1[k--]=nums2[j--];
        }
        return nums1;
    }
    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        int m = 3, n = 3;
        int[] ans=merge(num1,m,num2,n);
        for (int i=0;i< ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
