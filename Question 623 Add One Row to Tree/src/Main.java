public class Main {
    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int val) {
           this.val = val;
       }
    }
    public TreeNode helper(TreeNode root,int val,int depth,int currdepth){
        if(depth==1){
            TreeNode zoo=new TreeNode(val);
            zoo.left=root;
            return zoo;
        }
        if(root==null) return root;
        if(currdepth==depth-1){
            TreeNode leftman=root.left;
            TreeNode rightman=root.right;
            root.left=new TreeNode(val);
            root.right=new TreeNode(val);
            root.left.left=leftman;
            root.right.right=rightman;
            return root;
        }
        helper(root.left,val,depth,currdepth+1);
        helper(root.right,val,depth,currdepth+1);
        return root;
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        return  helper(root,val,depth,1);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(6);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(1);
        a.left=c;
        a.right=d;
        TreeNode e=new TreeNode(5);
        b.left=e;
        int val = 1, depth = 2;
        TreeNode ans=addOneRow(root,val,depth);
    }
}