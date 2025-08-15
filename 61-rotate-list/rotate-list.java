class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // find size
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        k = k % size; // avoid extra full rotations
        if (k == 0) return head;

        ListNode dummy = head;
        for (int i = 0; i < k; i++) {
            ListNode tail = dummy;
            ListNode beforeTail = null;

            // find tail and node before tail
            while (tail.next != null) {
                beforeTail = tail;
                tail = tail.next;
            }

            // detach and move last node to front
            beforeTail.next = null;
            tail.next = dummy;
            dummy = tail;
        }
        return dummy;
    }
}
