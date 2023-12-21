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
    public int pairSum(ListNode head) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        int count = 0;
        while(temp != null)
        {
            arr.add(temp.val);
            temp = temp.next;
            count = count+1;
        }
        int max = -1;
        int val = count;
        for(int i=0;i<count/2;i++)
        {
            max = Math.max(max,arr.get(i)+arr.get(val-1));
            val = val-1;
        }
        return max;
    }
}