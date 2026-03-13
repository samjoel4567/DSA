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
    public ListNode reverse(ListNode fakeHead){
        ListNode curr=fakeHead;
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
    public ListNode doubleIt(ListNode head) {
        head=reverse(head);
        int carry=0;
        ListNode temp=head;
        while(temp!=null){
            int a=(temp.val*2)+carry;
            carry=(a/10);

            temp.val=a%10;
            temp=temp.next;

        }
        
        head=reverse(head);
        if(carry!=0){
            ListNode newnode=new ListNode(carry);
            newnode.next=head;
            head=newnode;
        }
        return head;
    }
}