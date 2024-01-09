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
     ArrayList<Integer> lst1 = new ArrayList<>();
     ArrayList<Integer> lst2 = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) 
    {
        helper(root1,lst1);
        helper(root2,lst2);
        if(lst1.size() != lst2.size()) return false;
        int i=0;
        int j=0;
        while(i<lst1.size())
        {
            if(lst1.get(i) != lst2.get(j))
            {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
    public void helper(TreeNode root, ArrayList<Integer> X) {
    if (root == null) {
        return;
    }
    if (root.left == null && root.right == null) {
        X.add(root.val);
        return;
    }
    helper(root.left, X);
    helper(root.right, X);
}
}