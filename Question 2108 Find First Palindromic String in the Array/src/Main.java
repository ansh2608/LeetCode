public class Main {
    public static boolean isPalindrome(String s){
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l++)!=s.charAt(r--)) return false;
        }
        return true;
    }
    public static String firstPalindrome(String[] words) {
        for(String word:words){
            if(isPalindrome(word)) return word;
        }
        return "";
    }
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }
}