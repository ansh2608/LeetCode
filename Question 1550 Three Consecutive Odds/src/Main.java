public class Main {
    public static boolean threeConsecutiveOdds(int[] arr) {
        boolean flag=false;
        if(arr.length<3) return flag;
        for(int i=0;i<arr.length-2;i++){
            if((arr[i]%2==1) && (arr[i+1]%2==1) && (arr[i+2]%2==1)) flag=true;
        }
        return flag;
    }
    public static void main(String[] args) {
        int[] arr = {2,6,4,1};
        System.out.println(threeConsecutiveOdds(arr));
    }
}