package Sept17;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // new list that will have the answer
        ListNode dummyList = new ListNode(0);
        // current node we are at
        ListNode curr = dummyList;
        // what we carry over to the next node val
        int remainder = 0; 
        // loop continues if one list doesn't reach null, or if remainder has value in it
        while (l1 != null || l2 != null || remainder == 1) {
            // sum to keep track of adding the different nodes
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {   
                sum += l2.val;
                l2 = l2.next;
            }
            // add remainder to sum too
            sum += remainder;
            // find new remainder
            remainder = sum/10;
            // the value added to the new node is up to 9 only
            ListNode node = new ListNode(sum % 10);
            // add node to end of list
            curr.next = node;
            // move current node pointer over one
            curr = curr.next;
        }

        // return .next since the head is actually 0 all the time.
        // .next is real start of list
        return dummyList.next;

    }
}