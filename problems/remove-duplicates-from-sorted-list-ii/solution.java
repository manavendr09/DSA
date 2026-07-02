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
        ListNode d1=new ListNode(0);
        d1.next=head;
ListNode h=d1;
ListNode d=head;
while(d!=null){
    int a=0;
    while(d.next!=null&&d.val==d.next.val){
        d=d.next;
        a++;
    }
    if(a>0){
        h.next=d.next;
    }
    else{
    h=h.next;
    }
 d=d.next;
}
return d1.next;
    }
}