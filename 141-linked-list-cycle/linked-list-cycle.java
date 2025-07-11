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
        ListNode temp=head;
        ListNode tempp=head;
        while(temp!=null && temp!=null && temp.next!=null){
            temp=temp.next.next;
            tempp=tempp.next;
            if(temp==tempp){
                return true;
            }
        }
        return false;
    }
}