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
    public void reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next= null;

        while (curr != null) {
            next = curr.next; // store next node
            curr.next = prev;          // reverse the pointer
            prev = curr;               // move prev forward
            curr = next;               // move curr forward
        }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null || left==right){
            return head;
        }
        ListNode a= null, b=null, c=null, d=null;
        int pos=1;
        ListNode temp= head; 
        while(temp != null){
            if(pos==left-1) a=temp;
            if(pos==left) b=temp;
            if(pos==right) c=temp;
            if(pos==right+1) d=temp;
            temp= temp.next;
            pos++;
        }
        if(a !=null) a.next=null; 
        if(c !=null) c.next=null;
        reverseList(b);
        if(a !=null) a.next=c; 
        b.next=d;
        if(a==null) return c;
        return head;
    }
}