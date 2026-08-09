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
    private void helper(TreeNode root, List<Integer> inodr){
         if(root == null)
            return;
        helper(root.left,inodr);
        inodr.add(root.val);
        helper(root.right,inodr);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inodr = new ArrayList<>();
        helper(root,inodr);
        return inodr;
    }
}