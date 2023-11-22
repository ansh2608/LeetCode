import java.util.*;
public class Diagonal_Traverse {
    static int[] findDiagonalOrder(List<List<Integer>> nums) {
        int count = 0;
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            List<Integer> row = nums.get(i);
            for (int j = 0; j < row.size(); j++) {
                int idx = i + j;
                if (lists.size() < idx + 1) lists.add(new ArrayList<>());
                lists.get(idx).add(row.get(j));
                count ++;
            }
        }
        int[] res = new int[count];
        int idx = 0;
        for (List<Integer> list : lists) {
            for (int i = list.size() - 1; i >= 0; i--) {
                res[idx++] = list.get(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(findDiagonalOrder(nums));
    }
}
