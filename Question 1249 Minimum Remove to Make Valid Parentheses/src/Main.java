import java.util.Stack;

public class Main {
    public static String minRemoveToMakeValid(String s) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') st.push(i);
            else if(s.charAt(i)==')'){
                if(!st.isEmpty()&&s.charAt(st.peek())=='(') st.pop();
                else st.push(i);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(!st.isEmpty()&&st.peek()==i) st.pop();
            else sb.append(s.charAt(i));
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";
        System.out.println(minRemoveToMakeValid(s));
    }
}