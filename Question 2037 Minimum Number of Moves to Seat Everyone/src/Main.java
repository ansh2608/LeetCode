public class Main {
    public static int minMovesToSeat(int[] seats, int[] students) {
        int[] pos = new int[101];
        int n = seats.length;
        for(int i = 0; i < n; i++){
            pos[seats[i]]++;
            pos[students[i]]--;
        }
        int res = 0;
        int current = 0;
        for(int i: pos){
            res += Math.abs(current);
            current += i;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] seats = {3,1,5}, students = {2,7,4};
        System.out.println(minMovesToSeat(seats,students));
    }
}