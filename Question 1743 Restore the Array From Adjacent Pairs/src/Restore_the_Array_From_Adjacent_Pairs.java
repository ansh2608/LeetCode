import java.util.*;
public class Restore_the_Array_From_Adjacent_Pairs {
    static int[] restoreArray(int[][] adjacentPairs){
        HashMap<Integer,ArrayList<Integer>> h = new HashMap<Integer,ArrayList<Integer>>();
        for(int[] pair: adjacentPairs) {
            int first = pair[0];
            int second = pair[1];
            h.computeIfAbsent(first, key -> new ArrayList<>()).add(second);
            h.computeIfAbsent(second, key -> new ArrayList<>()).add(first);
        }
        int firstElement = 0;
        for(int key:h.keySet()) {
            if(h.get(key).size()==1) {
                firstElement = key;
                break;
            }
        }
        int ansLen = h.size();
        int[] ans = new int[ansLen];
        int currentElement = firstElement;
        int nextElement = 0;
        for(int i=0;i<ansLen;i++) {
            ans[i] = currentElement;
            if(h.get(currentElement).size()!=0){
                nextElement = h.get(currentElement).get(0);
                ArrayList<Integer> t = h.get(nextElement);
                t.remove(Integer.valueOf(currentElement));
                h.put(nextElement,t);
                currentElement = nextElement;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] adjacentPairs= {{2,1},{3,4},{3,2}};
        int[] ans=restoreArray(adjacentPairs);
        for (int i:ans){
            System.out.print(i+" ");
        }
    }
}
