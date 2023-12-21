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
    int count = 0;
    public int averageOfSubtree(TreeNode root) 
    {
        helper(root);
        return count;
    }
    public void helper(TreeNode root)
    {
        Stack<TreeNode> stk = new Stack<>();
        stk.push(root);
        int rroot = root.val;
        int up = 0;
        int down = 0;
        while(!stk.isEmpty())
        {
            TreeNode X = stk.pop();
            up = up + X.val;
            down = down + 1;
            if(X.left != null) stk.push(X.left);
            if(X.right != null) stk.push(X.right);
        }
        if(rroot == (up/down))
        {
            count = count + 1;
        }
        if(root.left != null)
        {
            helper(root.left);
        }
        if(root.right != null)
        {
            helper(root.right);
        }
    }

}