import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int val) { this.val = val; }
    }
    public static boolean isEvenOddTree(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        boolean flag = true;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            int prev = flag ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (flag) if (node.val % 2 == 0 || node.val <= prev) return false;
                else if (node.val % 2 != 0 || node.val >= prev) return false;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
                prev = node.val;
            }
            flag = !flag;
        }
        return true;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode a=new TreeNode(10);
        TreeNode b=new TreeNode(4);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(3);
        a.left=c;
        TreeNode d=new TreeNode(7);
        TreeNode e=new TreeNode(9);
        b.left=d;
        b.right=e;
        TreeNode f=new TreeNode(12);
        TreeNode g=new TreeNode(8);
        c.left=f;
        c.right=g;
        TreeNode h=new TreeNode(6);
        d.left=h;
        TreeNode i=new TreeNode(2);
        e.right=i;
        System.out.println(isEvenOddTree(root));

    }
}