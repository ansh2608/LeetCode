public class Determine_ReachableTime {
    static boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t){
        int xdiff = Math.abs(sx - fx), ydiff = Math.abs(sy - fy);
        if(xdiff == 0 && ydiff == 0 && t == 1) return false;
        return Math.max(xdiff, ydiff) <= t;
    }
    public static void main(String[] args) {
        System.out.println(isReachableAtTime(2,4,7,7,6));
    }
}
