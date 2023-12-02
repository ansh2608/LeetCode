public class Find_Words {
    static int countCharacters(String[] words, String chars) {
        int[] counts = new int[26];
        for(int i=0;i<chars.length();i++) counts[chars.charAt(i)-'a']++;
        int res =0 ;
        for(String s : words) {
            if(canForm(s,counts)) res+=s.length();
        }
        return res;
    }
    static boolean canForm(String word, int[] counts) {
        int[] c = new int[26];
        for(int i =0;i<word.length();i++) {
            int x = word.charAt(i)-'a';
            c[x]++;
            if(c[x] > counts[x]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        System.out.println(countCharacters(words,chars));
    }
}
