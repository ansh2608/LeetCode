import java.util.HashSet;

public class Maximum_Numbers {
    static int maxNumbers(int[] bag){
        HashSet<Integer> table=new HashSet<>();
        int max=0;
        for (int i=0;i<bag.length;i++) {
            int curr = bag[i];
            if (table.contains(curr)) table.remove(curr);
            else {
                table.add(curr);
                max = Math.max(max, table.size());
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={2,1,1,3,2,3};
        System.out.println(maxNumbers(arr));
    }
}
