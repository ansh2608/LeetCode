import java.util.ArrayList;
import java.util.List;

public class Leaf_Similar_Trees {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }
    public static void leaf(TreeNode root, List<Integer> arr){
        if (root==null) return;
        if (root.left==null && root.right==null) arr.add(root.val);
        leaf(root.left,arr);
        leaf(root.right,arr);
    }
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> arr1=new ArrayList<>();
        leaf(root1,arr1);
        List<Integer> arr2=new ArrayList<>();
        leaf(root2,arr2);
        return arr1.equals(arr2);
    }
    public static void main(String[] args) {
        TreeNode root1=new TreeNode(3);
        TreeNode a=new TreeNode(5);
        TreeNode b=new TreeNode(1);
        root1.left=a;
        root1.right=b;
        TreeNode c=new TreeNode(6);
        TreeNode d=new TreeNode(2);
        a.left=c;
        a.right=d;
        TreeNode e=new TreeNode(9);
        TreeNode f=new TreeNode(8);
        b.left=e;
        b.right=f;
        TreeNode g=new TreeNode(7);
        TreeNode h=new TreeNode(4);
        d.left=g;
        d.right=h;

        TreeNode root2=new TreeNode(3);
        TreeNode p=new TreeNode(5);
        TreeNode q=new TreeNode(1);
        root2.left=p;
        root2.right=q;
        TreeNode r=new TreeNode(6);
        TreeNode s=new TreeNode(7);
        p.left=r;
        p.right=s;
        TreeNode t=new TreeNode(4);
        TreeNode u=new TreeNode(2);
        q.left=e;
        q.right=f;
        TreeNode v=new TreeNode(9);
        TreeNode w=new TreeNode(8);
        u.left=v;
        u.right=w;
        System.out.println(leafSimilar(root1,root2));
    }
}
