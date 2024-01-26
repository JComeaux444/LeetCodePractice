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
    // A little confusing but writing/graphing it out makes more sense.
    
    // diameter
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {

        diameterFinder(root);
        return diameter;
        
    }
    // main recursive part
    public int diameterFinder( TreeNode node ) {
        // if we are at a non existant node return 0
        if (node == null) {
            return 0;
        }
        // find left length from this node
        int left = diameterFinder(node.left);
        // find right length from this node
        int right = diameterFinder(node.right);
        // make the diameter the longest length you find 
        // between two nodes in a tree
        diameter = Math.max(diameter, left+right);
        // return longest of left/right and add one
        return Math.max(left, right)+1;
    }
}
