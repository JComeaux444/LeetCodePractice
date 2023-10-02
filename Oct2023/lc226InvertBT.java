package Oct2023;

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
    public TreeNode invertTree(TreeNode root) {
        // base case 
        if (root == null) {
            return null;
        }
        // make a new node with the right/left sides swapped
        TreeNode temp = new TreeNode(root.val, root.right, root.left);
        // assign temp to root
        root = temp;
        // swap root left and right
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        // return result
        return root;
    }

   








}