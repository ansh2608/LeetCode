import java.util.Scanner;

public class Distinct_Colors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int j=0;j<n;j++) a[j]=sc.nextInt();
            int max=a[0];
            for(int j=0;j<n;j++) if(a[j]>max) max=a[j];
            System.out.println(max);
        }
    }
}
