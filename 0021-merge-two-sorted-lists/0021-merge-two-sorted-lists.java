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
    public ListNode mergeTwoLists(ListNode N1, ListNode N2) {
        ListNode result = new ListNode();
        ListNode head = result;
        while(N1!=null && N2!=null){
            if(N1.val<N2.val){
               result.next = N1;
               N1 = N1.next;
            }else{
              result.next = N2;
              N2 = N2.next;
            }
            result = result.next;
        }       
        if(N1!=null){
            result.next=N1;
        }else{
            result.next=N2;
        }
        
        return head.next;
    }
}