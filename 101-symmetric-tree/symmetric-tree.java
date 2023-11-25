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
    public boolean isSymmetric(TreeNode root) 
    {
        TreeNode x = root.left;
        TreeNode y = root.right;
        if(x==null && y==null)
        {
            return true;
        }
        if(x!=null && y!=null)
        {  
        if(root.left.val == root.right.val)
        {
            boolean ans = checker(root.left,root.right);
            return ans;
        }
        }
        return false;
        
    }

    public boolean checker(TreeNode left,TreeNode right)
    {
        Stack<TreeNode> one = new Stack<>();
        Stack<TreeNode> two = new Stack<>();

        one.push(left);
        two.push(right);

        while(!one.isEmpty() && !two.isEmpty())
        {
            TreeNode p = one.pop();
            TreeNode q = two.pop();

            if(p == null && q==null)
            {
                continue;
            }
            if(p == null || q == null || p.val!=q.val)
            {
                return false;
            }
            one.push(p.left);
            one.push(p.right);

            two.push(q.right);
            two.push(q.left);
        }
        return one.isEmpty() && two.isEmpty();
    }
}