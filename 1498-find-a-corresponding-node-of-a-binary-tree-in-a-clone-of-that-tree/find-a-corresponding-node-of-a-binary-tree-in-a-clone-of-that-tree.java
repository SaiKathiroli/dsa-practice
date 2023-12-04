/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) 
    {
        Stack<TreeNode> a = new Stack<>();
        Stack<TreeNode> b = new Stack<>();
        a.push(original);
        b.push(cloned);
        while(!a.isEmpty() && !b.isEmpty())
        {
            TreeNode sample1 = a.pop();
            TreeNode sample2 = b.pop();
            if(sample1.val == target.val)
            {
                return sample2;
            }
            if(sample1.left != null) a.push(sample1.left);
            if(sample1.right != null) a.push(sample1.right);
            if(sample2.left != null) b.push(sample2.left);
            if(sample2.right != null) b.push(sample2.right);
        }
        return null;
    }
}