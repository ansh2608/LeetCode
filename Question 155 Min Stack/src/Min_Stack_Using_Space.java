import java.util.Stack;

public class Min_Stack_Using_Space {
    static class MinStack {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> min=new Stack<>();
        public MinStack() {
            // constructor
        }
        public void push(int val) {
            if (st.isEmpty()){
                st.push(val);
                min.push(val);
            }
        }
        public void pop() {
            st.pop();
            min.pop();
        }
        public int top() {
            return st.peek();
        }
        public int getMin() {
            return min.peek();
        }
    }
    public static void main(String[] args) {
        MinStack st=new MinStack();
        st.push(7);
        st.push(8);
        st.push(5);
        st.push(6);
        st.push(3);
        st.push(4);
        System.out.println(st.top());
        System.out.println(st.getMin());
        st.pop();
    }
}
