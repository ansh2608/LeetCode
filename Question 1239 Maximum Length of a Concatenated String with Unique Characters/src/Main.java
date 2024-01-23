import java.util.*;
public class Main {
    public static int solve(String[] str, int no, int[] a, int index, int c) {
        if(index==c) return 0;
        int x=no & a[index];
        if(x==0) return Math.max(str[index].length()+solve(str,no^a[index],a,index+1,c),solve(str,no,a,index+1,c));
        else return solve(str,no,a,index+1,c);
    }
    public static int maxLength(List<String> arr) {
        int[] a=new int[arr.size()];int c=0;String[] str=new String[a.length];
        for(String s:arr) {
            int x=0,fl=0;
            for(char ch:s.toCharArray()) {
                int z=x|(1<<(ch-96));
                if(x==z) {
                    fl=1;
                    break;
                }
                x=z;
            }
            if(fl==0) {
                a[c]=x;
                str[c++]=s;
            }
        }
        return solve(str,0,a,0,c);
    }
    public static void main(String[] args) {
        List<String> arr= Arrays.asList("un","iq","ue");
        System.out.println(maxLength(arr));
    }
}