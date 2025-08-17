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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            if(st.isEmpty()){
                st.push(temp.val);
            }
            else if(temp.val>st.peek()){
                while(!st.isEmpty() && temp.val>st.peek()){
                    st.pop();
                }
                st.push(temp.val);
            }
            else{
                st.push(temp.val);
            }
            temp=temp.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode x=dummy;
        for(int ch : st){
            ListNode newnode = new ListNode(ch);
            x.next=newnode;
            x=newnode;
            newnode.next=null;
        }
        return dummy.next;
    }
}