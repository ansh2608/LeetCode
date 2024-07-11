public class Main {
    public static int i=0;
    public static String reverseParentheses(String s) {
        char[] ar=s.toCharArray();
        return helper(ar);
    }
    public static String helper(char[] s){
        StringBuilder sb = new StringBuilder();
        while(i<s.length){
            if(s[i]==')'){
                i++;
                return sb.reverse().toString();
            }
            else if(s[i]=='('){
                i++;
                String st = helper(s);
                sb.append(st);
            }
            else{
                sb.append(s[i]);
                i++;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "(abcd)";
        System.out.println(reverseParentheses(s));
    }
}