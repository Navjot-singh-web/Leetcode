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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       HashMap<Integer,Integer> hm = new HashMap<>();
       int n = inorder.length;
       for(int i=0;i<n;i++){
        hm.put(inorder[i],i);
       } 
       TreeNode root = builder(inorder,0,n-1,preorder,0,n-1,hm);
        return root;
    }
    public TreeNode builder(int[] inorder, int inStart, int inEnd, int[] preorder, int preStart, int preEnd, HashMap<Integer,Integer> hm){
        if(preStart>preEnd || inStart>inEnd) return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int hMap = hm.get(root.val);
        int numsLeft = hMap-inStart;
        root.left = builder(inorder,inStart,hMap-1,preorder,preStart+1,preStart+numsLeft,hm);
        root.right = builder(inorder,hMap+1,inEnd,preorder,preStart+numsLeft+1,preEnd,hm);
        return root;
    }
}