/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        if(head==null || head.next==null) return false;
        /*Set<ListNode> visited=new HashSet<>();
        ListNode current=head;
        while(current !=null){
            if(visited.contains(current)){
                return true;
            }
            visited.add(current);
            current=current.next;

        }

        return false;*/

        ListNode slow= head;
        ListNode fast= head.next;
        while(slow != fast){
           if (fast == null || fast.next == null) return false;
            slow=slow.next;
            fast=fast.next.next;


        }
        return true;
        
    }

}