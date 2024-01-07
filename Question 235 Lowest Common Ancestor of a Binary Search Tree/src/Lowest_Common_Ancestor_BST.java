import java.util.LinkedList;
import java.util.Queue;

public class Lowest_Common_Ancestor_BST {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public static int height(TreeNode root){
        if (root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static void nthLevel(TreeNode root,int n){
        if (root==null) return;
        if (n==1) System.out.print(root.val+" ");
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
    }
    public static TreeNode constructTree(String[] arr){
        int x=Integer.parseInt(arr[0]);
        TreeNode root=new TreeNode(x);
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int i=1;
        while (i<arr.length-1){
            TreeNode temp=q.remove();
            TreeNode left=new TreeNode(0);
            TreeNode right=new TreeNode(0);
            if (arr[i].isEmpty()) left=null;
            else {
                left.val=Integer.parseInt(arr[i]);
                q.add(left);
            }
            if (arr[i+1].isEmpty()) right=null;
            else {
                right.val=Integer.parseInt(arr[i+1]);
                q.add(right);
            }
            temp.left=left;
            temp.right=right;
            i+=2;
        }
        return root;
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val<root.val && q.val>root.val) return root;
        if (p.val>root.val && q.val<root.val) return root;
        if (p==root || q==root) return root;
        if (p==q) return p;
        if (root.val>p.val || root.val>q.val) return lowestCommonAncestor(root.left,p,q);
        else return lowestCommonAncestor(root.right,p,q);
    }
    public static void main(String[] args) {
        String[] arr={"6","2","8","0","4","7","9","","","3","5"};
        TreeNode root=constructTree(arr);
        int level=height(root)+1;
        for (int i=1;i<=level;i++){
            nthLevel(root,i);
            System.out.println();
        }
        TreeNode p=new TreeNode(2);
        TreeNode q=new TreeNode(8);
        TreeNode LCA=lowestCommonAncestor(root,p,q);
        System.out.println(LCA);
    }
}
