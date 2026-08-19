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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return check(root,p,q);
    }
    private TreeNode check(TreeNode root, TreeNode p, TreeNode q){
        TreeNode ans = null;
        if((root.val> p.val && root.val < q.val) || (root.val< p.val && root.val > q.val))
           return root;
        else if(root.val == p.val )
           return p;
       else if(root.val == q.val)
           return q;
      else  if(root.val > p.val && root.val > q.val)
          return check(root.left,p,q);
        else
          return check(root.right,p,q);
        
    }
}