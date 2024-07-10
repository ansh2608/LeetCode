import java.util.Stack;

public class Main {
    public static int minOperations(String[] logs) {
        Stack<String> paths_stack = new Stack<>();
        for (String log : logs) {
            if (log.equals("../")) {
                if (!paths_stack.isEmpty()) paths_stack.pop();
            }
            else if (!log.equals("./")) paths_stack.push(log);
        }
        return paths_stack.size();
    }
    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","../","d21/","./"};
        System.out.println(minOperations(logs));
    }
}