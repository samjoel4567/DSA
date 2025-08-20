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
    public ListNode deleteDuplicates(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp= head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode tail=dummy;
        for(int n : list){
            int m=Collections.frequency(list,n);
            if(m<2){
                ListNode newnode = new ListNode(n);
                tail.next=newnode;
                newnode.next=null;
                tail=newnode;
            }
        }
        return dummy.next;
    }
}