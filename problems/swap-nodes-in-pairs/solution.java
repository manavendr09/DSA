class Solution {
    public ListNode swapPairs(ListNode head) {
       if(head==null||head.next==null) return head;
        ListNode f=head;
        ListNode s=head.next;
        f.next=swapPairs(s.next);
        s.next=f;
        
        return s;
    }
}