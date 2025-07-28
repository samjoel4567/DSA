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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        ListNode temp=l1;
        ListNode temp2=l2;
        while(temp!=null || temp2!=null){
            if(temp!=null){
                stack1.push(temp.val);
                temp=temp.next;
            }
            if(temp2!=null){
                stack2.push(temp2.val);
                temp2=temp2.next;
            }
        }
        int carry=0;
        
        ListNode dummy = null;

        while(!stack1.isEmpty() ||  !stack2.isEmpty() || carry!=0){
            int num1 = 0;
            int num2=0;
            if(!stack1.isEmpty()){
                num1=stack1.pop();
            }
            if(!stack2.isEmpty()){
                num2=stack2.pop();
            }
            int tot = num1+num2+carry;
            carry=tot/10;
            tot=tot%10;
            
            ListNode node = new ListNode(tot);
            node.next=dummy;
            dummy=node;
        }
        return dummy;
    }
}