import java.util.LinkedList;
import java.util.Queue;

public class Validate_BST {
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
    public static boolean flag=true;
    public static TreeNode prev=null;
    public static void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        if(prev==null) prev=root;
        else if(root.val<=prev.val) flag=false;
        else prev=root;
        inOrder(root.right);
    }
    public static boolean isValidBST(TreeNode root) {
        flag=true;
        prev=null;
        inOrder(root);
        return flag;
    }
    public static void main(String[] args) {
        String[] arr={"2","2","2"};
        TreeNode root=constructTree(arr);
        int level=height(root)+1;
        for (int i=1;i<=level;i++){
            nthLevel(root,i);
            System.out.println();
        }
        System.out.println(isValidBST(root));
    }
}
