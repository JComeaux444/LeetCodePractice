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
    public TreeNode sortedArrayToBST(int[] nums) {
        return TreeBuilder(0, nums.length-1, nums);
    }
    
    public TreeNode TreeBuilder(int left, int right, int[] nums) {
        // base case
        if (left > right) {
            return null;
        }
        // find middle value
        int mid = left + (right - left) / 2;
        // make root the middle value
        TreeNode root = new TreeNode(nums[mid]);
        
        //do the same for each side
        // this assigns the value for the subtrees, basically finds middle of both sides
        root.left = TreeBuilder(left, mid - 1, nums);
        root.right = TreeBuilder(mid +1, right, nums);

        // return root node of this tree. Ends up being highest root node at top call.
        return root;
    }
}