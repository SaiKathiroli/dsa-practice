/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max = Integer.MIN_VALUE;
    public int maxAncestorDiff(TreeNode root) 
    {
        helper(root,root.val);
        return max;
    }

    public void helper(TreeNode root,int rto)//root.val)
    {
        if(root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode r = q.poll();
            max = Math.max(max,Math.abs(rto-r.val));
            if(r.left!=null) q.add(r.left);
            if(r.right != null) q.add(r.right);
        }
        if(root.left != null )helper(root.left,root.left.val);
        if(root.right != null )helper(root.right,root.right.val);
    }
}