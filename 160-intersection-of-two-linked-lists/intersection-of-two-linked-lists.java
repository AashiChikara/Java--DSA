/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA= headA;
        ListNode tempB= headB;
        int LenA=0;
        while(tempA != null){
            tempA= tempA.next;
            LenA++;
        }
        int LenB=0;
        while(tempB != null){
            tempB= tempB.next;
            LenB++;
        }
        tempA=headA;
        tempB=headB;
        if(LenA>LenB){
            for(int i=1;i<=LenA-LenB;i++){
                tempA=tempA.next;
            }
        }
        else{
            for(int j=1;j<=LenB-LenA;j++){
                tempB=tempB.next;
            }
        }
        while(tempA !=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
    }
}
