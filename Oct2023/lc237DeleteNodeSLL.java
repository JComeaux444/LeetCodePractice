package Oct2023;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // make current node the next value
        node.val = node.next.val;
        // skip over the next node (removing the dupe)
        node.next = node.next.next;

        /*
        // First try, works 0ms, but not optimal since O(N)
        // while we are not at the second to last node
        while(node.next.next != null) {
            node.val = node.next.val;
            node = node.next;
        }
        // we are at the second to last node
        // copy next val
        node.val = node.next.val;
        // remove the last node since it would be a dupe
        node.next = null;
        */
        
    }
}