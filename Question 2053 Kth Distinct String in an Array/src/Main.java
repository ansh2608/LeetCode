import java.util.HashMap;

public class Main {
    public static String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> mp=new HashMap<>();
        for(String str:arr) mp.put(str,mp.getOrDefault(str,0)+1);
        for(String str: arr){
            if(mp.get(str)==1) {
                --k;
                if(k==0) return str;
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        int k = 2;
        System.out.println(kthDistinct(arr,k));
    }
}