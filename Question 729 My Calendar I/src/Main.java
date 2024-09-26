import java.util.TreeMap;

public class Main {
    class MyCalendar {
        TreeMap<Integer, Integer> calcy;
        public MyCalendar() {
            calcy = new TreeMap();

        }
        public boolean book(int start, int end) {
            Integer prevBook = calcy.floorKey(start);
            Integer nextBook = calcy.ceilingKey(start);
            if((prevBook==null || calcy.get(prevBook)<=start) && (nextBook==null || end<=nextBook)) {
                calcy.put(start, end);
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}