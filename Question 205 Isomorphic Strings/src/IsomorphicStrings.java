import java.util.HashMap;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mp=new HashMap<>();
        for (int i=0; i < s.length(); i++){
            char sCh = s.charAt(i);
            char tCh=t.charAt(i);
            if (mp.containsKey(sCh)) {
                if (mp.get(sCh)!=tCh) return false;
            }
            else if(mp.containsValue(tCh)) return false;
            else mp.put(sCh,tCh);
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "eggh", t = "addd";
        System.out.println(isIsomorphic(s,t));
    }
}

