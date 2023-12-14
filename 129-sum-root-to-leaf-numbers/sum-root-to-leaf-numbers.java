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
    int ans = 0;
    public int sumNumbers(TreeNode root) 
    {
        loop(root,root.val);
        return ans;
    }

    public void loop(TreeNode root,int X)
    {
        if(root.left == null && root.right == null)
        {
            ans = ans + X;
            return;
        }
        if(root.left != null)  loop(root.left,X*10 + root.left.val);
        if(root.right != null) loop(root.right,X*10 + root.right.val);
    }
}