import java.util.*;
public class Morris_Traversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }
    public static void merge(List<Integer> a,List<Integer> b,List<Integer> ans){
        int i=0,j=0;
        while (i<a.size() && j<b.size()){
            if (a.get(i)<=b.get(j)) {
                ans.add(a.get(i));
                i++;
            }
            else {
                ans.add(b.get(j));
                j++;
            }
        }
        if (a.size()==i){
            while (j<b.size()) {
                ans.add(b.get(j));
                j++;
            }
        }
        if (j==b.size()){
            while (i<a.size()){
                ans.add(a.get(i));
                i++;
            }
        }
    }
    public static List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> a=new ArrayList<>();
        TreeNode curr=root1;
        while (curr!=null){
            if (curr.left!=null){ // find pre
                TreeNode pre=curr.left;
                while (pre.right!=null && pre.right!=curr) pre=pre.right;
                if (pre.right==null){
                    pre.right=curr;
                    curr =curr.left;
                }
                if (pre.right==curr){
                    pre.right=null;
                    a.add(curr.val);
                    curr=curr.right;
                }
            }
            else {
                a.add(curr.val);
                curr=curr.right;
            }
        }
        List<Integer> b=new ArrayList<>();
        curr=root2;
        while (curr!=null){
            if (curr.left!=null){ // find pre
                TreeNode pre=curr.left;
                while (pre.right!=null && pre.right!=curr) pre=pre.right;
                if (pre.right==null){
                    pre.right=curr;
                    curr =curr.left;
                }
                if (pre.right==curr){
                    pre.right=null;
                    b.add(curr.val);
                    curr=curr.right;
                }
            }
            else {
                b.add(curr.val);
                curr=curr.right;
            }
        }
        List<Integer> ans=new ArrayList<>();
        merge(a,b,ans);
        return ans;
    }
    public static void main(String[] args) {
        TreeNode root1=new TreeNode(2);
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(4);
        root1.left=a;
        root1.right=b;
        TreeNode root2=new TreeNode(2);
        TreeNode p=new TreeNode(1);
        TreeNode q=new TreeNode(4);
        root2.left=p;
        root2.right=q;
        List<Integer> ans=getAllElements(root1,root2);
        System.out.println(ans);
    }
}
