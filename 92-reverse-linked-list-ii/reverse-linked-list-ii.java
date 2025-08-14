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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp =head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int[] arr = new int[size];
        ListNode head2= head;
        for(int i=0;i<size;i++){
            arr[i]=head2.val;
            head2=head2.next;
        }
        while(left<=right){
            int tem=arr[left-1];
            arr[left-1]=arr[right-1];
            arr[right-1]=tem;
            left++;
            right--;

        }
        ListNode dummy = new ListNode(0);
        ListNode emp=dummy;
        for(int i=0;i<arr.length;i++){
            ListNode newnode = new ListNode(arr[i]);
            emp.next=newnode;
            emp=newnode;
            newnode.next=null;

        }
        return dummy.next;
    }
}