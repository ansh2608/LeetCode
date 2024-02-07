import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
    public static String frequencySort(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for (char ch:s.toCharArray()) mp.put(ch,mp.getOrDefault(ch,0)+1);
        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(mp.entrySet());
        StringBuilder ans=new StringBuilder();
        while (!pq.isEmpty()){
            Map.Entry<Character,Integer> entry=pq.poll();
            ans.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}