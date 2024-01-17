import java.util.*;

public class Main {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:arr) mp.put(i,mp.getOrDefault(i,0)+1);
        Set<Integer> s=new HashSet<>(mp.values());
        return s.size()==mp.size();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
}