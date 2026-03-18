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
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast=head;
        if(fast.next.next==null){
            return slow.val+slow.next.val;
        }
        while(fast!=null){
            fast=fast.next.next;

            if(fast==null){
                break;
            }
            slow=slow.next;
        }
        ListNode head2=slow.next;
        slow.next=null;
        ListNode head3=reverse(head2);
        ListNode temp=head;
        int max=Integer.MIN_VALUE;
        while(head3!=null){
            int a=temp.val+head3.val;
            max=Math.max(a,max);
            temp=temp.next;
            head3=head3.next;
        }
        
        return max;
    }
}