import java.util.Stack;

public class Main {
    public static long resolves(long a, long b, char Operator) {
        if (Operator == '+') return a + b;
        else if (Operator == '-') return a - b;
        else if (Operator == '*') return a * b;
        return a / b;
    }
    public static int evalRPN(String[] tokens) {
        Stack<Long> stack = new Stack<>();
        int n = tokens.length;
        for (int i = 0; i < n; i++) {
            if (tokens[i].length() == 1 && tokens[i].charAt(0) < 48) {
                long integer2 = stack.pop();
                long integer1 = stack.pop();
                char operator = tokens[i].charAt(0);
                long resolvedAns = resolves(integer1, integer2, operator);
                stack.push(resolvedAns);
            }
            else stack.push(Long.parseLong(tokens[i]));
        }
        return stack.pop().intValue();
    }
    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        System.out.println(evalRPN(tokens));
    }
}