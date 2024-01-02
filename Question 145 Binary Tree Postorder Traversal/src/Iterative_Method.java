import java.util.*;
public class Iterative_Method {
    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int val) {
           this.val = val;
       }
    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if (root==null) return ans;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while (!st.isEmpty()){
            TreeNode temp=st.peek();
            if (temp.left!=null) {
                st.push(temp.left);
                temp.left=null;
            }
            else if (temp.right!=null){
                st.push(temp.right);
                temp.right=null;
            }
            else{
                st.pop();
                ans.add(temp.val);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(3);
        root.right=a;
        a.left=b;
        List<Integer> ans=preorderTraversal(root);
        System.out.println(ans);
    }
}
