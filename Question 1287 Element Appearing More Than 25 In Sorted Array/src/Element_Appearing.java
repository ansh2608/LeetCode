public class Element_Appearing {
    static int lower_bound(int[] arr, int val){
        int l=0,r=arr.length-1;
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if (arr[mid]>=val){
                ans=mid;
                r=mid-1;
            }
            else l=mid+1;
        }
        return ans;
    }
    static boolean valid(int[] arr,int ind){
        int n=arr.length;
        int start=lower_bound(arr,arr[ind]);
        if (arr[start+(n/4)]==arr[ind]) return true;
        return false;
    }
    static int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int first = n / 4;
        int second = n / 2;
        int third = 3 * n / 4;
        if(valid(arr, first)) return arr[first];
        else if(valid(arr, second)) return arr[second];
        else if(valid(arr, third)) return arr[third];
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,6,6,6,6,7,10};
        System.out.println(findSpecialInteger(arr));
    }
}
