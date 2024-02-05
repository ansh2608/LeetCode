public class Main {
    public static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }
    public static Node sortedInsert(Node head, int data) {
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            head.next=head;
        }
        else if(data<head.data){
            Node temp=head;
            while(temp.next!=head) temp=temp.next;
            head=newNode;
            newNode.next=temp.next;
            temp.next=head;
        }
        else{
            Node temp=head;
            while(temp.next!=head && data>temp.next.data) temp=temp.next;
            newNode.next=temp.next;
            temp.next=newNode;
        }
        return head;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(4);
        a.next=b;
        b.next=c;
        c.next=a;
        Node ans=sortedInsert(a,2);
        while (ans!=null){
            System.out.println(ans.data);
            ans=ans.next;
        }
    }
}