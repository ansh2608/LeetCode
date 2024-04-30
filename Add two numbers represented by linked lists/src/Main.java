public class Main {
    public static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    static Node addTwoLists(Node num1, Node num2){
        Node a = reverse(num1);
        Node b = reverse(num2);
        Node temp = new Node(0);
        Node ans = temp;
        int carry = 0;
        while(a!=null && b!=null){
            int val = a.data + b.data + carry;
            Node node = new Node((val%10));
            temp.next = node;
            temp = temp.next;
            carry = val/10;
            a = a.next;
            b = b.next;
        }
        while(a!=null){
            int val = a.data + carry;
            Node node = new Node((val%10));
            temp.next = node;
            temp = temp.next;
            carry = val/10;
            a = a.next;
        }
        while(b!=null){
            int val = b.data + carry;
            Node node = new Node((val%10));
            temp.next = node;
            temp = temp.next;
            carry = val/10;
            b = b.next;
        }
        Node node = new Node(carry);
        temp.next = node;
        ans = ans.next;
        Node p = reverse(ans);
        while(p.data==0 && p.next!=null) p = p.next;
        return p;
    }
    public static Node reverse(Node start){
        Node prev = start;
        Node curr = start.next;
        prev.next = null;
        while(curr!=null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node num1 = new Node(4);
        Node a=new Node(5);
        num1.next=a;
        a.next=null;
        Node num2 = new Node(3);
        Node x=new Node(3);
        Node y=new Node(4);
        Node z=new Node(5);
        num2.next=x;
        x.next=y;
        y.next=z;
        Node ans=addTwoLists(num1,num2);
        while (ans!=null){
            System.out.print(ans.data);
            ans=ans.next;
        }
    }
}