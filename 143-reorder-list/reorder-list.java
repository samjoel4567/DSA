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
    private ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode next=curr;
        ListNode prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode temp2=reverse(slow.next);
        slow.next=null;
        ListNode temp1=head;
        while(temp2!=null){
            ListNode temp11=temp1.next;
            ListNode temp22=temp2.next;
            temp1.next=temp2;
            temp2.next=temp11;
            temp1=temp11;
            temp2=temp22;
        }
        
    }
}