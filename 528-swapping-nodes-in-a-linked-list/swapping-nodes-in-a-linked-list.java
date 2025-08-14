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
    public ListNode swapNodes(ListNode head, int k) {
        List<Integer> list = new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int l=list.size()-1;
        for(int i=0;i<list.size();i++){
            if(k==i+1){
                int tem=list.get(i);
                list.set(i,list.get(l));
                list.set(l,tem);
            }
            else{
                l--;
            }


        }
            ListNode dummy = new ListNode(0);
            ListNode tep=dummy;        
            for(int j=0;j<list.size();j++){
                ListNode newnode = new ListNode(list.get(j));
                tep.next=newnode;
                tep=newnode;
                newnode.next=null;
            }
        return dummy.next;
    }
}