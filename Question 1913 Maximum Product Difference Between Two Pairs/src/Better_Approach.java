public class Better_Approach {
    static int maxProductDifference(int[] arr) {
        int First_Big=0,Second_Big=0, First_Small=Integer.MAX_VALUE, Second_Small=Integer.MAX_VALUE;
        for (int i:arr){
            if (i<First_Small){
                Second_Small=First_Small;
                First_Small=i;
            }
            else if (i<Second_Small) Second_Small=i;
            if (i>First_Big){
                Second_Big=First_Big;
                First_Big=i;
            }
            else if (i>Second_Big) Second_Big=i;
        }
        return First_Big*Second_Big - First_Small*Second_Small;
    }
    public static void main(String[] args) {
        int[] num = {5,6,2,7,4};
        System.out.println(maxProductDifference(num));
    }
}
