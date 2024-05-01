public class TwoPointer {
    public static void swap(StringBuilder sb,int k,int l){
        char temp= sb.charAt(k);
        sb.replace(k,k+1,""+sb.charAt(l));
        sb.replace(l,l+1,""+temp);
    }
    public static String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder(word);
        int k=0,l=word.indexOf(ch);
        while (k<l){
            swap(sb,k,l);
            k++;
            l--;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word,ch));
    }
}
