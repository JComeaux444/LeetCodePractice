package Sept29;

import java.util.LinkedList;
import java.util.Queue;

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
        // If root is null just return 0, else errors below
        if (root == null) {
            return 0;
        }
        // queue used to find each level of the tree
        Queue<TreeNode> tQueue = new LinkedList<>();
        // add root node
        tQueue.add(root);
        // counts depth
        int count = 0;
        // keep going until empty
        while (!tQueue.isEmpty()) {
            // size of queue
            int size = tQueue.size();
            // while size is not 0
            // size will only get to zero when the current level / row / depth
            // is finished going through, hence count counts each row
            while (size > 0) {
                // deincrement from size
                size--;
                // using the popped node
                TreeNode temp = tQueue.poll();
                // if left node isn't null, add new node
                if (temp.left != null) {
                    tQueue.add(temp.left);
                }
                // if right node isn't null, add new node
                if (temp.right != null) {
                    tQueue.add(temp.right);
                }
            }
            // count only goes up on each level of the tree
            count++;
        }


        return count;
        /*
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
        */



    }
}