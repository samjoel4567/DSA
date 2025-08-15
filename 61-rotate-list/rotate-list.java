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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tail=head;
        if(tail==null || tail.next==null){
            return tail;
        }
        int size=0;
        while(tail.next!=null){
            tail=tail.next;
            size++;
        }
        size++;
        k=k%size;
        ListNode dummy =head;
        ListNode temp = head;
        for(int i=0;i<k;i++){
            while(temp.next!=tail){
                temp=temp.next;
            }
            temp.next=null;
            tail.next=dummy;
            dummy=tail;
            tail=temp;
            temp=dummy;

        }
        return dummy;
    }
}