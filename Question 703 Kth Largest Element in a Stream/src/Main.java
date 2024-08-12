import java.util.PriorityQueue;

public class Main {
    public PriorityQueue<Integer> heap=new PriorityQueue<>();
    public int k;
    public Main(int k, int[] nums) {
        this.k=k;
        for(int n:nums) add(n);
    }
    public int add(int val) {
        heap.offer(val);
        if(heap.size()>k) heap.poll();
        return heap.peek();
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}