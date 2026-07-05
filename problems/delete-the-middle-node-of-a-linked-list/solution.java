class Solution {
    public ListNode deleteMiddle(ListNode head) {
      
       if(head==null||head.next==null) return null;
       ListNode d=new ListNode(0);
       d.next=head;
       ListNode s=d;
       ListNode f=head;
       while(f!=null && f.next!=null){
        s=s.next;
        f=f.next.next;
       }
       s.next=s.next.next;
       return head; 
    }
}