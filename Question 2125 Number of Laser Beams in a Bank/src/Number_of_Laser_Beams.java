public class Number_of_Laser_Beams {
    public static int numberOfBeams(String[] bank) {
        int ans = 0, prev = 0;
        for(String s: bank) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) if (s.charAt(i) == '1') count++;
            if (count > 0) {
                ans += prev * count;
                prev = count;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] bank = {"011001","000000","010100","001000"};
        System.out.println(numberOfBeams(bank));
    }
}
