import java.util.Arrays;

public class Maximum_Product_Difference {
    static int maxProductDifference(int[] arr) {
        Arrays.sort(arr);
        return (arr[arr.length-1]*arr[arr.length-2])-(arr[0]*arr[1]);
    }
    public static void main(String[] args) {
        int[] num = {5,6,2,7,4};
        System.out.println(maxProductDifference(num));
    }
}
