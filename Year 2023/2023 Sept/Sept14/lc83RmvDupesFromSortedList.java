package Sept14;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode firstEncounter = head;

        while (firstEncounter != null) {
            if (firstEncounter.next == null) {
                break;
            }
            if (firstEncounter.val == firstEncounter.next.val) {
                firstEncounter.next = firstEncounter.next.next;
            } else {
                firstEncounter = firstEncounter.next;
            }
            
        }

        return head;
        
    }
}