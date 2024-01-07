import java.util.LinkedList;
import java.util.Queue;

public class Delete_Node_BST {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    static int height(TreeNode root){
        if (root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    static void nthLevel(TreeNode root,int n){
        if (root==null) return;
        if (n==1) System.out.print(root.val+" ");
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
    }
    static TreeNode constructTree(String[] arr){
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
    static void delete(TreeNode root,int val){
        if (root==null) return;
        if (root.val>val) {
            if (root.left==null) return;
            if (root.left.val==val){
                TreeNode l=root.left;
                if (l.left==null && l.right==null) root.left=null;
                else if (l.left==null || l.right==null){
                    if (l.left!=null) root.left=l.left;
                    else root.left=l.right;
                }
                else {
                    TreeNode curr=l;
                    TreeNode pred=curr.left;
                    while (pred.right!=null) pred=pred.right;
                    delete(root, pred.val);
                    pred.left=curr.left;
                    pred.right=curr.right;
                    root.left=pred;
                }
            }
            else delete(root.left,val);
        }
        else {
            if (root.right==null) return;
            if (root.right.val==val){
                TreeNode r=root.right;
                if (r.left==null && r.right==null) root.right=null;
                else if (r.left==null || r.right==null){
                    if (r.left!=null) root.right=r.left;
                    else root.right=r.right;
                }
                else {
                    TreeNode curr=r;
                    TreeNode pred=curr.left;
                    while (pred.right!=null) pred=pred.right;
                    delete(root, pred.val);
                    pred.left=curr.left;
                    pred.right=curr.right;
                    root.right=pred;
                }
            }
            else delete(root.right,val);
        }
    }
    static TreeNode deleteNode(TreeNode root,int val){
        TreeNode temp=new TreeNode(Integer.MAX_VALUE);
        temp.left=root;
        delete(temp,val);
        return temp.left;
    }
    public static void main(String[] args) {
        String[] arr={"36","24","50","18","26","44","54","2","","","28"};
        TreeNode root=constructTree(arr);
        int level=height(root)+1;
        for (int i=1;i<=level;i++){
            nthLevel(root,i);
            System.out.println();
        }int val=26;
        TreeNode del=deleteNode(root,val);
        int hi=height(del)+1;
        for (int i=1;i<=hi;i++){
            nthLevel(del,i);
            System.out.println();
        }
    }
}
