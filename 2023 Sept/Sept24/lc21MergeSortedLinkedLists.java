package Sept24;

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // If any list is null,  return the other
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        
        //make a new list and then a reference to its beginning
        ListNode endList = new ListNode(0);
        ListNode endRef = new ListNode(0,endList);
        
        // while the lists are both full
        while (list1 != null && list2 != null) {
            // if l1 val is <= l2 val then the next node to append is list1
            // otherwise it would be list2
            if (list1.val <= list2.val) {
                endList.next = list1;
                list1 = list1.next;
            } else {
                endList.next = list2;
                list2 = list2.next;
            }
            // After appending a value move onto the next node to add to
            endList = endList.next;
        }

        //if list1 is null append the last of list2, otherwise append list1
        if (list1 == null) {
            endList.next = list2;
        } else {
            endList.next = list1;
        }
        
        //append start of the real list, as first 2 nodes are 0 by default.
        return endRef.next.next;
        
    }
}