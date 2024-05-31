import java.util.*;

public class Main {
    public static int[] singleNumber(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int i:nums) mp.put(i,mp.getOrDefault(i,0)+1);
        for(Map.Entry<Integer,Integer> it:mp.entrySet()){
            if(it.getValue()==1) ans.add(it.getKey());
        }
        int[] res=new int[ans.size()];
        for(int i=0;i<ans.size();i++) res[i]=ans.get(i);
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        int[] ans=singleNumber(nums);
        for(int i:ans) System.out.print(i+" ");
    }
}