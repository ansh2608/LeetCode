public class Main {
    public static int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];
        for (final int student : students) ++count[student];
        for (int i = 0; i < sandwiches.length; ++i) {
            if (count[sandwiches[i]] == 0) return sandwiches.length - i;
            --count[sandwiches[i]];
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] students = {1,1,0,0}, sandwiches = {0,1,0,1};
        System.out.println(countStudents(students,sandwiches));
    }
}