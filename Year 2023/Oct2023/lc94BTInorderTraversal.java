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
    public List<Integer> inorderTraversal(TreeNode root) {
        // inorder list of the traversal
        List<Integer> list = new ArrayList<Integer>();
        // stack that keeps track of current nodes
        Stack<TreeNode> stack = new Stack<TreeNode>();
        // current node
        TreeNode cur = root;
        // while the current node exists or the stack isn't empty
        while (cur != null || !stack.empty()) {
            // while current node isn't null
            while (cur != null) {
                // add current node to stack
                stack.add(cur);
                // go to the left node and set as current
                cur = cur.left;
            }
            // current node is the node being popped from the stack
            cur = stack.pop();
            // add the current value to the inorder list
            list.add(cur.val);
            // make current node go to the right node
            cur = cur.right;
        }
        // return in order list
        return list;
    }
}