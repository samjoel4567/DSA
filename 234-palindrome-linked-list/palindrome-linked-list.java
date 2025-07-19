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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        StringBuilder str = new StringBuilder();
        while(temp!=null){
            str.append(temp.val);
            temp=temp.next;
        }
        String og = str.toString();
        String rev = str.reverse().toString();
        if(og.equals(rev)){
            return true;
        } 
        else{
            return false;
        }
    }
}