import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer,Integer> lost=new HashMap<>();
        for (int[] m:matches){
            lost.putIfAbsent(m[0],0);
            lost.put(m[1],lost.getOrDefault(m[1],0)+1);
        }
        List<Integer> zero=lost.entrySet().stream()
                .filter(entry -> entry.getValue()==0)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList());
        List<Integer> ones=lost.entrySet().stream()
                .filter(entry -> entry.getValue()==1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList());
        List<List<Integer>> result = new ArrayList<>();
        result.add(zero);
        result.add(ones);
        return result;
    }
    public static void main(String[] args) {
        int[][] matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        List<List<Integer>> ans=findWinners(matches);
        System.out.println(ans);
    }
}