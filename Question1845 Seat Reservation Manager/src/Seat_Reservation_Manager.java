import java.util.*;
public class Seat_Reservation_Manager {
    class SeatManager {
        PriorityQueue<Integer> pq;
        int count;
        public SeatManager(int n) {
            count = 1;
            pq = new PriorityQueue();
        }
        public int reserve() {
            if(pq.size()==0)
                return count++;
            return pq.poll();
        }
        public void unreserve(int seatNumber) {
            pq.add(seatNumber);
        }
    }
    public static void main(String[] args) {
        SeatManager obj=new SeatManager();
        int param_1 = obj.reserve();
        obj.unreserve(5);
    }
}
