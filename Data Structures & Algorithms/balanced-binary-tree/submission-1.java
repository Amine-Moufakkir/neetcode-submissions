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
    private boolean isBalanced = true;
    
    private int maxDepth(TreeNode root) {
        if (root == null) {return 0;}

        int leftHeight, rightHeight;
        leftHeight = maxDepth(root.left);
        rightHeight = maxDepth(root.right);
        if (Math.abs(leftHeight - rightHeight) > 1) {isBalanced = false;}

        return Math.max(leftHeight, rightHeight) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        isBalanced = true;
        maxDepth(root);
        return isBalanced;
    }
}
