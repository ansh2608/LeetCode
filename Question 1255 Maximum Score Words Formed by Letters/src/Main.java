public class Main {
    public static int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] count = new int[26];
        int[] lettersCount = new int[26];
        for (char c : letters) count[c - 'a']++;
        int ans = 0;
        ans = backtracking(words, score, count, lettersCount, 0, 0, ans);
        return ans;
    }
    private static int backtracking(String[] words, int[] score, int[] count, int[] lettersCount, int pos, int temp, int ans) {
        for (int i = 0; i < 26; i++) if (lettersCount[i] > count[i]) return ans;
        ans = Math.max(ans, temp);
        for (int i = pos; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                lettersCount[c - 'a']++;
                temp += score[c - 'a'];
            }
            ans = backtracking(words, score, count, lettersCount, i + 1, temp, ans);
            for (char c : words[i].toCharArray()) {
                lettersCount[c - 'a']--;
                temp -= score[c - 'a'];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] words = {"dog","cat","dad","good"};
        char[] letters = {'a','a','c','d','d','d','g','o','o'};
        int[] score = {1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(maxScoreWords(words,letters,score));
    }
}