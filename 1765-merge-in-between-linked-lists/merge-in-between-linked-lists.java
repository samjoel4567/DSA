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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
        ListNode tempp = list1;
        for(int i=0;i<a-1;i++){
            if(temp!=null){
                temp=temp.next;
            }
        }
        for(int j=0;j<=b;j++){
          
                tempp=tempp.next;
            
        }
        ListNode end=list2;
        while(end.next!=null){
            end=end.next;
        }
        temp.next=list2;
        end.next=tempp;
        return list1;
    }
}