public class Main {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int ans = 0;
        for(int i=0;i<tickets.length;i++) {
            if(i<=k) {
                if(tickets[i]<=tickets[k]) ans+=tickets[i];
                else ans+=tickets[k];
            }
            else {
                if(tickets[i]<tickets[k]) ans+=tickets[i];
                else ans+=tickets[k]-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] tickets = {2,3,2};
        int k = 2;
        System.out.println(timeRequiredToBuy(tickets,k));
    }
}