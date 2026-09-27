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
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode tmp = head.next;
        while (head != null && tmp != null) {

            // base case: head and next are same
            if (head == tmp) {
                return true;
            }

            if (head.next == null || tmp.next == null) {
                return false;
            }
            head = head.next;
            tmp = tmp.next.next;
        }
        return false;
    }
}
