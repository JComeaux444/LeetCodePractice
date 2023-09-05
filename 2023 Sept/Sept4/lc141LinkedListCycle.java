package Sept4;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        if(head.next == head) return true;
        ListNode hare = head, tort = head;
        while ( hare != null && hare.next != null) {
            tort = tort.next;
            hare = hare.next.next;

            if (tort == hare) return true; 
        }
        return false;
    }
}