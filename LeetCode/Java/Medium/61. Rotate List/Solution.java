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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode slow= head;
        ListNode fast= head;
        ListNode dummy = head;
        int length=1;
        while(dummy.next!=null){
            length++;
            dummy = dummy.next;
        }
        k = k % length;
        if (k == 0) {
    return head;
}
        for(int i=0;i<k;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode temp = slow.next;
        slow.next= null;
        fast.next=head;
        return temp;
    }
}