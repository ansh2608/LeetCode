import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Amount_of_Time_BT_Infected {
    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int val) {
           this.val = val;
       }
    }
    public static TreeNode getNode(TreeNode root, int start){
        if (root==null) return null;
        if (root.val==start) return root;
        TreeNode left=getNode(root.left,start);
        TreeNode right=getNode(root.right,start);
        if (left==null) return right;
        else return left;
    }
    public static void preOrder(TreeNode root,HashMap<TreeNode,TreeNode> mp){
        if (root==null) return;
        if (root.left!=null) mp.put(root.left,root);
        if (root.right!=null) mp.put(root.right,root);
        preOrder(root.left,mp);
        preOrder(root.right,mp);
    }
    public static int amountOfTime(TreeNode root, int start) {
        TreeNode node=getNode(root,start);
        HashMap<TreeNode,TreeNode> mp=new HashMap<>();
        preOrder(root,mp);
        //BFS
        Queue<TreeNode> q=new LinkedList<>();
        q.add(node);
        HashMap<TreeNode,Integer> v=new HashMap<>();
        v.put(node,0);
        while (!q.isEmpty()){
            TreeNode temp=q.peek();
            int level=v.get(temp);
            if (temp.left!=null && !v.containsKey(temp.left)){
                q.add(temp.left);
                v.put(temp.left,level+1);
            }
            if (temp.right!=null && !v.containsKey(temp.right)){
                q.add(temp.right);
                v.put(temp.right,level+1);
            }
            if (mp.containsKey(temp) && !v.containsKey(mp.get(temp))){
                q.add(mp.get(temp));
                v.put(mp.get(temp),level+1);
            }
            q.remove();
        }
        int max=-1;
        for (int val:v.values()){
            max=Math.max(max,val);
        }
        return max;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode a=new TreeNode(5);
        TreeNode b=new TreeNode(3);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(4);
        a.right=c;
        TreeNode d=new TreeNode(10);
        TreeNode e=new TreeNode(6);
        b.left=d;
        b.right=e;
        TreeNode f=new TreeNode(9);
        TreeNode g=new TreeNode(2);
        c.left=f;
        c.right=g;
        int start=3;
        System.out.println(amountOfTime(root,start));
    }
}
