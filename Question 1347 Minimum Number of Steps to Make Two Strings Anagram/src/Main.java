public class Main {
    public static int minSteps(String s, String t) {
        int[] countS = new int[26];
        int[] countT = new int[26];
        for (char ch : s.toCharArray()) countS[ch - 'a']++;
        for (char ch : t.toCharArray()) countT[ch - 'a']++;
        int steps = 0;
        for (int i = 0; i < 26; i++) steps += Math.abs(countS[i] - countT[i]);
        return steps / 2;
    }
    public static void main(String[] args) {
        String s = "bab", t = "aba";
        System.out.println(minSteps(s,t));
    }
}