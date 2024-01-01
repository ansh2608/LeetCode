import java.util.Arrays;

public class Assign_Cookies {
    public static int findContentChildren(int[] g, int[] s) {
        int cookiesNum=s.length;
        if (cookiesNum==0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int cookieIndex=cookiesNum-1;
        int childIndex=g.length-1;
        while (cookieIndex>=0 && childIndex>=0){
            if (s[cookieIndex]>=g[childIndex]){
                count++;
                cookieIndex--;
                childIndex--;
            }
            else childIndex--;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] g = {10,9,8,7};
        int[] s = {5,6,7,8};
        System.out.println(findContentChildren(g,s));
    }
}
