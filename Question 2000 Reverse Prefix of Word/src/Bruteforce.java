public class Bruteforce {
    public static String reversePrefix(String word, char ch) {
        int idx=-1;
        String ans="";
        for(int i=0;i<word.length();i++){
            char curr=word.charAt(i);
            if(curr==ch){
                idx=i;
                break;
            }
        }
        if (idx==-1) return word;
        for (int i=idx;i>=0;i--){
            char curr=word.charAt(i);
            ans+=curr;
        }
        for (int i=idx+1;i<word.length();i++){
            char curr=word.charAt(i);
            ans+=curr;
        }
        return ans;
    }
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word,ch));
    }
}
