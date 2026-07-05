class Solution {
    public void reorderList(ListNode head) {
       ListNode s=head;
       ListNode f=head;
       while(f!=null && f.next!=null){
        s=s.next;
        f=f.next.next;
       }
       ListNode n=rev(s.next);       
       s.next=null;
       ListNode p=head;
       while(n!=null){
       ListNode m=p.next;
       ListNode o=n.next;
        p.next=n;
        n.next=m;
        p=m;
        n=o;
    }
    return; 
    }
    public ListNode rev(ListNode r){
        if(r==null||r.next==null) return r;
        ListNode n=rev(r.next);
        r.next.next=r;
        r.next=null;
        return n;
    }
}