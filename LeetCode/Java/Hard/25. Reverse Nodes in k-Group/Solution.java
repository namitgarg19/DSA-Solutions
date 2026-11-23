class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;
        int count = 0;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        int r = count / k;

        ListNode prev = null;
        ListNode curr = head;
        ListNode ans = null;
        ListNode groupTail = null;

        for(int i = 0; i < r; i++){

            prev = null;
            ListNode groupHead = curr;

            for(int j = 0; j < k; j++){
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            if(ans == null){
                ans = prev;
            }
            else{
                groupTail.next = prev;
            }

            groupTail = groupHead;
            groupTail.next = curr;
        }

        return ans == null ? head : ans;
    }
}