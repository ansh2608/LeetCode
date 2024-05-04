import java.util.Arrays;

public class Main {
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats=0,i=0,j= people.length-1;
        while (i<=j){
            if (people[i]+people[j]<=limit) i++;
            j--;
            boats++;
        }
        return boats;
    }
    public static void main(String[] args) {
        int[] people = {1,2};
        int limit = 3;
        System.out.println(numRescueBoats(people,limit));
    }
}