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
    private int count;
    private void dfs(TreeNode node, int maxSoFar) {
        if (node == null) {
            return;
        }
        if (node.val >= maxSoFar) {
            maxSoFar = node.val;
            count++;
        }
        dfs(node.left, maxSoFar);
        dfs(node.right, maxSoFar);
    }
    public int goodNodes(TreeNode root) {
        count = 0;
        if (root == null) {
            return count;
        }
        dfs(root, Integer.MIN_VALUE);
        return count;
    }
}
