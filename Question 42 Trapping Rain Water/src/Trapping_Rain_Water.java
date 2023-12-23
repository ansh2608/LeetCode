import java.util.Stack;

public class Trapping_Rain_Water {
    static int trap(int[] height) {
        int l=0,r=height.length-1,l_max=Integer.MIN_VALUE,r_max=Integer.MIN_VALUE,ans=0;
        while (l<r){
            l_max=Math.max(l_max,height[l]);
            r_max=Math.max(r_max,height[r]);
            ans+=(l_max<r_max) ? l_max-height[l++] : r_max-height[r--];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
