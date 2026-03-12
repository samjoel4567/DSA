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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for(int n :nums){
            set.add(n);
        }
        ListNode dummy = new ListNode(0);
        ListNode fh=dummy;
        fh.next=head;
        ListNode temp=fh;
        while(temp!=null){
            if(temp.next!=null && set.contains(temp.next.val)){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return fh.next;
    }
}