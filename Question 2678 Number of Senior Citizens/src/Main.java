public class Main {
    public static int countSeniors(String[] details) {
        int cnt=0;
        for(int i=0;i<details.length;i++){
            String str=details[i].substring(11,13);
            int age=Integer.parseInt(str);
            if(age>60) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(details));
    }
}