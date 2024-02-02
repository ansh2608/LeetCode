import java.util.*;
public class Main {
    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans=new ArrayList<>();
        for (int i=1;i<=9;i++){
            int num=i;
            for (int j=i+1;j<=9;j++){
                num=num*10+j;
                if (num>=low && num<=high) ans.add(num);
            }
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        int low = 1000, high = 13000;
        System.out.println(sequentialDigits(low,high));
    }
}