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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode s=head;
        ListNode f=head;
        while(f!=null&&f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        if(f!=null) s=s.next;

        //ListNode m=head;
        ListNode r=reverse(s);
        while(r!=null){
            if(head.val!=r.val) return false;
            head=head.next;
            r=r.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head){

         if(head==null || head.next==null) return head;
         ListNode p=head;
         ListNode c=head.next;
         while(c!=null){
            ListNode n=c.next;
            c.next=p;

            p=c;
            c=n;

         }
         head.next=c;
         head=p;
         return head;
        // ListNode l=reverse(head.next);
        // head.next.next=head;
        // head.next=null;
        // return l;
    }
}