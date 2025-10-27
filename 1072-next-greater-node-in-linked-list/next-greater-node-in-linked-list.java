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
    public int[] nextLargerNodes(ListNode head) {
        int s=0;
        ListNode temp0=head;
        while(temp0!=null){
            s++;
            temp0=temp0.next;
        }
        ListNode temp=head;
        ListNode temp2=head;
        boolean f=false;
        int[] arr = new int[s];
        int i=0;
        while(temp!=null){
            f=false;
            temp2=temp.next;
            int m=temp.val;
            while(temp2!=null){
                if(temp2.val>m){
                    f=true;
                    m=temp2.val;
                    break;
                }
                temp2=temp2.next;
            }
            if(f){
                arr[i]=m;
            }
            else{
                arr[i]=0;
            }
            i++;
            temp=temp.next;
        }

        return arr;
    }
}