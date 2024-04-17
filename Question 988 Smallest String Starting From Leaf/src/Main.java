public class Main {
    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int val) {
           this.val = val;
       }
    }
    public static String smallestFromLeaf(TreeNode root) {
        return smallStr(root,new StringBuilder()).toString();
    }
    public static StringBuilder smallStr(TreeNode root,StringBuilder sb){
        if(root==null) return sb;
        sb.append((char)('a' + root.val));
        if(root.left==null && root.right==null) return sb.reverse();
        StringBuilder sb1 = root.left != null ? smallStr(root.left,new StringBuilder(sb)):null;
        StringBuilder sb2 = root.right !=null ? smallStr(root.right,new StringBuilder(sb)):null;
        if(sb1!=null && sb2!=null) return sb1.toString().compareTo(sb2.toString())<0 ? sb1 : sb2;
        else return sb1!=null ? sb1 : sb2;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(0);
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(2);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(4);
        a.left=c;
        a.right=d;
        TreeNode e=new TreeNode(3);
        TreeNode f=new TreeNode(4);
        b.left=e;
        b.right=f;
        System.out.println(smallestFromLeaf(root));
    }
}