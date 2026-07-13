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
    public void reorderList(ListNode head) {

     if (head == null || head.next == null) {
           return;
       }

       //get Middle Node
       ListNode slow = head;
       ListNode fast = head;
       while (fast.next != null && fast.next.next != null) {
           slow = slow.next;
           fast = fast.next.next;
       }
       //Reverse 2nd half List
        ListNode preMiddle = slow;
       ListNode precurr = slow.next;

       while (precurr.next != null) {
           ListNode current = precurr.next;
           precurr.next = current.next;
           current.next = preMiddle.next;
           preMiddle.next = current;
       }

       slow=head;
       fast=preMiddle.next;

       while (slow!=preMiddle) {
           preMiddle.next=fast.next;
           fast.next=slow.next;
           slow.next=fast;
           slow=fast.next;
           fast=preMiddle.next;
       }



        
    }
}