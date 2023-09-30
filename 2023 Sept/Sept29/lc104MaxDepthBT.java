package Sept29;

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
    public int maxDepth(TreeNode root) {
        // Recursive solution here, BFS later
        // Base Condition
        if (root == null) {
            return 0;
        }
        // Hypothesis / Check each side of this root and count
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        // Induction / return the max of these sides.
        // don't forget to add one since this counts the depth durign recurrsion
        return Math.max(left,right)+1;
    }
}