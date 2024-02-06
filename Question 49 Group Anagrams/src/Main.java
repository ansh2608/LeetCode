import java.util.*;

public class Main {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp=new HashMap<>();
        for (String word:strs){
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String sortedWord=new String(ch);
            if (!mp.containsKey(sortedWord)) mp.put(sortedWord,new ArrayList<>());
            mp.get(sortedWord).add(word);
        }
        return new ArrayList<>(mp.values());
    }
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}