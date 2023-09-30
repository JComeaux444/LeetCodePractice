package Sept30;

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // recursive, Iterative is long
        // If both are null, then it must be equal hence true
        if (p == null && q == null) {
            return true;
        }
        // If one is null, and other isn't, it's not the same tree
        if (p == null || q == null) {
            return false;
        }
        // If the two vals are not the same it's a different tree too
        if (p.val != q.val) {
            return false;
        }
        // return if both sides of the trees are the same or not
        // left and right must be the same
        return (isSameTree(p.right,q.right) && isSameTree(p.left,q.left));
    }
}