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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ls = new ArrayList<>();

        if(root == null)
            return ls;
        q.offer(root);
        
        boolean leftToRight = true;

        while (!q.isEmpty()) {
            int n = q.size();
            int[] row = new int[n];

            for (int i = 0; i<n; i++) {
                TreeNode node = q.poll();
                int index = leftToRight ? i : n - 1 - i;
                row[index] = node.val;

                if (node.left != null) 
                    q.offer(node.left);
                if (node.right != null) 
                    q.offer(node.right);
            }

            List<Integer> subls = new ArrayList<>();

            for (int value : row) 
                subls.add(value);
            ls.add(subls);

            leftToRight = !leftToRight;
        }
        return ls;
    }
}