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
    public ListNode swapPairs(ListNode head) 
    {
        if(head == null || head.next == null)
        {
            return head;
        }

 //       if(head != null) {

            ListNode dummy = head.next;
            ListNode p = head;
            ListNode c = p.next;

            while (p != null && c != null) {
                p.next = c.next;
                c.next = p;
                ListNode temp = p;
                if (p.next == null) {
                    break;
                }
                p = p.next;
                c = p.next;
                if (c != null) {
                    temp.next = c;
                }
            }

            head = dummy;

            return head;
//         }

    }
}