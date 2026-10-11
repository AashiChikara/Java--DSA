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
        ListNode prev = null;
        ListNode curr = head;
        ListNode next= null;

        while (curr != null) {
            next = curr.next; // store next node
            curr.next = prev;          // reverse the pointer
            prev = curr;               // move prev forward
            curr = next;               // move curr forward
        }

        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode slow= head;
        ListNode fast= head;
        while(fast!= null && fast.next !=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode j= reverseList(slow);
        ListNode i=head;
        int maxsum=0;
        while(j!= null){
            int sum=i.val+j.val;
            maxsum= Math.max(maxsum,sum);
            i=i.next;
            j=j.next;
        }
        return maxsum;
        
    }
}