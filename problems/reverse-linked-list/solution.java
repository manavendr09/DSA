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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode p=head;
        ListNode c=head.next;
        while(c!=null){
            ListNode n=c.next;
            c.next=p;
            //update karenge sara
            
            p=c;
            c=n;
            
        }
        head.next=c;
        head=p;
        return head;
    }
}