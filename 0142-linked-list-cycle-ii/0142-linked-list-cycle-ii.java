public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;
        ListNode slower = head;
        ListNode faster = head;
        while (slower != null && faster !=null){
            slower = slower.next;
            faster = faster.next;
            if (faster != null)
                faster = faster.next;
            if (slower == faster)
                break;
        }//while
        if (faster == null)
            return null;
        slower = head;
        while (slower != faster){
            slower = slower.next;
            faster = faster.next;
        }
        return slower;
    }
}