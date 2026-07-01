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
    public ListNode deleteDuplicates(ListNode head) {
      // ListNode d1=new ListNode(0);
        ListNode d=head;
        while(d!=null){
           // d.next=new ListNode(head.val);
            //d=d.next;
            while(d.next!=null&&d.val==d.next.val){
                d.next=d.next.next;
            }
            d=d.next;
        }
        return head;
    }
}