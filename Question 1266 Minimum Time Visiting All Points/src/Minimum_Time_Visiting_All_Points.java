public class Minimum_Time_Visiting_All_Points {
    static int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for (int i = 0; i < points.length-1; i++) {
            int x = points[i][0];
            int y = points[i][1];
            int a = points[i+1][0];
            int b = points[i+1][1];
            time += Math.max(Math.abs(a - x), Math.abs(b - y));
        }
        return time;
    }
    public static void main(String[] args) {
        int[][] points = {{1,1},{3,4},{-1,0}};
        System.out.println(minTimeToVisitAllPoints(points));
    }
}
