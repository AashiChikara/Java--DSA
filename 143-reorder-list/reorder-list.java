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
    public ListNode middleNode(ListNode head){
        ListNode slow= head;
        ListNode fast= head;
        while(fast.next != null && fast.next.next != null){
            slow= slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
    public void reorderList(ListNode head) {
        ListNode leftMiddle= middleNode(head);
        ListNode h2= leftMiddle.next;
        leftMiddle.next=null;
        h2=reverseList(h2);
        ListNode d = new ListNode(-1);
        ListNode temp= d;
        while(head !=null && h2 !=null){
            temp.next=head;
            head= head.next;
            temp=temp.next;
            temp.next=h2;
            h2=h2.next;
            temp=temp.next;
        }
        if(head== null) temp.next=h2;
        if(h2==null) temp.next=head;
        head= d.next;


        
    }
}