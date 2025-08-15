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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode head2=head;
        int size=0;
        while(head2!=null){
            size++;
            head2=head2.next;
        }
        if(n==size){
            return head.next;
        }
        ListNode temp=head;
        ListNode temp2=head;
        for(int i=0;i<size-n-1;i++){
            if(temp!=null){
                temp=temp.next;
            }
        }
        temp.next=temp.next.next;
        return head;

    }
}