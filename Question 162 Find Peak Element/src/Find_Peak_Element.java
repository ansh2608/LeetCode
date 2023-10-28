public class Find_Peak_Element {
    static int peak(int[] arr){
        int st=0,end=arr.length-1,ans=-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if ((mid==0 || arr[mid]>arr[mid+1]) && (mid==arr.length-1 || arr[mid]>arr[mid-1])) return mid;
            if (arr[mid]<arr[mid+1]) st=mid+1;
            else end=mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(peak(arr));
    }
}
