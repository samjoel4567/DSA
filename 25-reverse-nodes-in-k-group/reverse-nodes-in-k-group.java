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
        private ListNode reverseNode(ListNode temp){
            ListNode curr=temp;
            ListNode prev = null;
            ListNode next=temp;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            return prev;
        }
        private ListNode getKnode(ListNode temp,int k){
            k=k-1;
            while(temp!=null && k>0 ){
                k--;
                temp=temp.next;
            }
            return temp;
        }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode head2=null;
        ListNode prevnode = null;
        while(temp!=null){
            ListNode knode = getKnode(temp,k);
            if(knode==null){
                if(prevnode!=null){
                    prevnode.next=temp;
                }
                if(head2!=null){
                    return head2;
                }
                else{
                    return head;
                }
            }
            ListNode next = knode.next;
            knode.next=null;

            ListNode tail=temp;
            temp=reverseNode(temp);
        
            if(head2 == null){
                head2=temp;

            }
            if(prevnode!=null){
                prevnode.next=temp;
            }
            prevnode =tail;
            temp=next;
        }
        return head2;
    }
}