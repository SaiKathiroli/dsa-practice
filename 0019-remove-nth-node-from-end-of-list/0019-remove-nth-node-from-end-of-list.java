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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
      ListNode temp = head;
      int count = 0;
      while(temp != null)
      {
          count +=1;
          temp=temp.next;
      }  
    if(count == n)
      {
          head = head.next;
          return head;
      }
      int fromBeginning = count - n-1;

      int start = 0;
      temp=head;
      while(true)
      {
          if(start >= fromBeginning)
          {
            break;
          }
          start+=1;
          temp=temp.next;
      }
        ListNode temp2 = temp.next;
        if(temp2 == null)
        {
            temp.next = null;
        }
        else
        {
        temp.next = temp2.next;
        }
        return head;   
    }
}