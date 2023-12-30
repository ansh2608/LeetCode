import java.util.HashMap;

public class Redistribute_Characters {
    public static boolean makeEqual(String[] words) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for (String str:words){
            for (int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                mp.put(ch,mp.getOrDefault(ch,0)+1);
            }
        }
        for (Character key: mp.keySet()){
            int freq=mp.get(key);
            if (freq% words.length!=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String[] words = {"abc","aabc","bc"};
        System.out.println(makeEqual(words));
    }
}
