import java.util.*;
public class Sort_Vowels_in_a_String {
    static String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) vowels.add(c);
        }
        Collections.sort(vowels, Collections.reverseOrder());
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                result.append(vowels.get(vowels.size() - 1));
                vowels.remove(vowels.size() - 1);
            } else result.append(c);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s="lEetcOde";
        System.out.println(sortVowels(s));
    }
}
