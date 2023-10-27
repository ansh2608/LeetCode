public class Search_2D_Matrix {
    static boolean search(int[][] arr,int x){
        int n=arr.length,m=arr[0].length;
        int st=0,end=n*m-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            int midElm = arr[mid/m][mid%m];
            if (midElm==x) return true;
            if (midElm>x) end=mid-1;
            else st=mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int x=199;
        System.out.println(search(arr,x));
    }
}
