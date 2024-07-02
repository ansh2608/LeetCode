public class Main {
    public static class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
        }
    }
    public static boolean compute(Node root) {
        if(root == null)return true;
        StringBuilder sb=new StringBuilder();
        Node current = root;
        while(current!= null){
            sb.append(current.data);
            current = current.next;
        }
        String org =sb.toString();
        String revorg = sb.reverse().toString();
        return org.equals(revorg);
    }
    public static void main(String[] args) {
        Node a=new Node("a");
        Node b=new Node("bc");
        Node c=new Node("d");
        Node d=new Node("dcb");
        Node e=new Node("a");
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println("Hello world!");
    }
}