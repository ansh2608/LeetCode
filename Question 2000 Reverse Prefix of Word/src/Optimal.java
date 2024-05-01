public class Optimal {
    public static String reversePrefix(String word, char ch) {
        int firstOccur = word.indexOf(ch);
        if (firstOccur==-1) return word;
        StringBuilder sb = new StringBuilder(word.substring(0,firstOccur+1)).reverse();
        if (firstOccur<word.length()) sb.append(word.substring(firstOccur+1));
        return sb.toString();
    }
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word,ch));
    }
}
