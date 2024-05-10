import java.util.Scanner;

public class Upside_Down_Matrix {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        assert (1 <= n && n <= 100);
        assert (1 <= m && m <= 100);
        int[][] a = new int[n][m];
        for (int i1 = 0; i1 < n; i1++) {
            for (int j1 = 0; j1 < m; j1++) {
                a[i1][j1] = sc.nextInt();
            }
        }
        for(int i=n-1;i>=0;i--){

            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
