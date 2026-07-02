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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode d=head;
        ListNode h=head;
        int c=0;
        while(d!=null) {
            c++;
            d=d.next;
        }
        if(c==n) return head.next; 
        int x=c-n-1;
        while(x>0){
            h=h.next;
            x--;
        }
        h.next=h.next.next; 
        return head;
    }
}