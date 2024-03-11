import java.util.HashMap;

public class Main {
    public static String customSortString(String order, String s) {
        StringBuilder result = new StringBuilder();
        HashMap<Character, Integer> mp = new HashMap<>();
        for (char c : s.toCharArray()) mp.put(c, mp.getOrDefault(c, 0) + 1);
        for (char c : order.toCharArray()) {
            if (mp.containsKey(c)) {
                result.append(String.valueOf(c).repeat(Math.max(0, mp.get(c))));
                mp.remove(c);
            }
        }
        for (char c : mp.keySet()) result.append(String.valueOf(c).repeat(Math.max(0, mp.get(c))));
        return result.toString();
    }
    public static void main(String[] args) {
        String order = "cba", s = "abcd";
        System.out.println(customSortString(order,s));
    }
}