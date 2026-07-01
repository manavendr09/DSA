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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode d1=new ListNode(0);
        ListNode d=d1;
        while(list1 != null && list2 !=null){
            if(list1.val<list2.val){
                d.next=new ListNode(list1.val);
                list1=list1.next;
            }
            else{
                d.next=new ListNode(list2.val);
                list2=list2.next;
            }
            d=d.next;
            }
            while(list1 != null){
                d.next=new ListNode(list1.val);
                d=d.next;
                list1=list1.next;
            }
            while(list2 != null){
                d.next=new ListNode(list2.val);
                d=d.next;
                list2=list2.next;
            }
            return d1.next;
        }
}