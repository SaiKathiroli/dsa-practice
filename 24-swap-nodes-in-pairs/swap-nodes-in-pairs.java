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
        if(head == null || head.next == null) return head;
        ListNode first = head;
        ListNode second = head.next;
        head = second;
        while(first.next != null && second.next != null)
        {
            first.next = second.next;
            second.next = first;
            ListNode dummy = first;
            first = first.next;
            if(first.next!=null)
            {
            second = first.next;
            dummy.next = second;
            }
        }
        if(first.next!=null)
        {
        second.next = first;
        first.next= null;
        }

        return head;
    }
}