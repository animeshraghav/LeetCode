public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode fakeHead = new ListNode(-1);
        ListNode node = head;
        while (node != null){
            ListNode nodeNext = node.next;
            node.next = fakeHead.next;
            fakeHead.next = node;
            node = nodeNext;
        }
        return fakeHead.next;
    }
}