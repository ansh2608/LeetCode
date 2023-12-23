import java.util.*;

public class Min_Stack {
    static class MinStack {
        int min = Integer.MAX_VALUE;
        Stack<Integer> stack = new Stack<Integer>();
        public void push(int x) {
            if(x <= min){
                stack.push(min);
                min=x;
            }
            stack.push(x);
        }
        public void pop() {
            if(stack.pop() == min) min=stack.pop();
        }
        public int top() {
            return stack.peek();
        }
        public int getMin() {
            return min;
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
        System.out.println(st.getMin());
        System.out.println(st.top());
        st.pop();
    }
}
