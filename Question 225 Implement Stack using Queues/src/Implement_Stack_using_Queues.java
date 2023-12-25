import java.util.*;

public class Implement_Stack_using_Queues {
    static class MyStack {
        Queue<Integer> q=new LinkedList<>();
        public void push(int x) {
            if (q.isEmpty()) q.add(x);
            else {
                q.add(x);
                for (int i=1;i<=q.size()-1;i++) q.add(q.remove());
            }
        }
        public int pop() {
            return q.remove();
        }
        public int top() {
            return q.peek();
        }
        public boolean empty() {
            if (q.isEmpty()) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        MyStack st=new MyStack();
        System.out.println(st.empty());
        st.push(1);
        st.push(2);
        System.out.println(st.empty());
        st.push(3);
        st.push(4);
        System.out.println(st.top());
        System.out.println(st.pop());
        System.out.println(st.top());
    }
}
