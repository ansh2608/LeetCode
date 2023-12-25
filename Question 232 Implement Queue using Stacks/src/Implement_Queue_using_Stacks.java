import java.util.Stack;

public class Implement_Queue_using_Stacks {
    static class MyQueue {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> helper=new Stack<>();
        public void push(int x) {
            if(st.size()==0) st.push(x);
            else{
                while(st.size()>0) helper.push(st.pop());
                st.push(x);
                while(helper.size()>0) st.push(helper.pop());
            }
        }
        public int pop() {
            return st.pop();
        }
        public int peek() {
            return st.peek();
        }
        public boolean empty() {
            if(st.size()==0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        MyQueue q=new MyQueue();
        q.push(1);
        System.out.println(q.empty());
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.peek());
    }
}
