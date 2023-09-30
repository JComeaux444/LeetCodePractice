package Sept29;

import java.util.Stack;

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
    public ListNode reverseList(ListNode head) {
        // if null return head, else causes issues for popping
        if (head == null) {
            return head;
        }

        // stack to store values in
        Stack<Integer> stackedArr = new <Integer>Stack();

        // while head has values still
        while (head != null) {
            // push value onto stack
            stackedArr.push(head.val);
            // most to next node
            head = head.next;
        }
        // reversed list
        ListNode revList = new ListNode(stackedArr.pop());
        // ref to head of reversed list since head pointer above will move
        ListNode revListReference = new ListNode(0,revList);

        // keep going until stack is emptied
        while (!stackedArr.isEmpty()) {
            // make new node w/ val to add to end of new linked list
            ListNode temp = new ListNode(stackedArr.pop());
            // append the new node 
            revList.next = temp;
            // move to new end of list
            revList = revList.next;
        }
        // return reference to head of new list. First ref is 0 and is a place holder
        return revListReference.next;
        
    }
}