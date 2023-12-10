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
    int count=0;
    public int goodNodes(TreeNode root) 
    {
        helper(root,root.val);
        return count;
    }

    public void helper(TreeNode X,int max)
    {
        if(X == null) return;
        int maxx= max;
        if(X.val >= max) 
        {
            count = count+1;
            maxx = X.val;
        }
        helper(X.left,maxx);
        helper(X.right,maxx);
    }
}