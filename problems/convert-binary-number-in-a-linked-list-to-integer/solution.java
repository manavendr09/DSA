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
    public int getDecimalValue(ListNode head) {
        int c=0;
        ListNode d=head;
        ListNode d1=head;
        while(d!=null){
            c++;
            d=d.next;
        }
        int ans=0;
        while(d1!=null){
            if(d1.val==1)
            ans=ans+(int)(Math.pow(2,c-1));
            d1=d1.next;
            c--;
        }
        return ans;
    }
}