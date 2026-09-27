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
        
        if (head == null) {
            return null;
        }

        ListNode current = head;
        if (head.next != null) {
            current = reverseList(current.next);
            head.next.next = head;
        }
        head.next = null;
        return current;



// iterative soln
        // ListNode curr = head;
        // ListNode prev = null;

        // while (curr != null) {
        //     // save off original next node
        //     ListNode temp = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = temp;
        // }

        // return prev;
    }
}
