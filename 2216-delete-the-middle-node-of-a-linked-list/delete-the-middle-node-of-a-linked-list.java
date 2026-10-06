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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null) return null;
        ListNode Slow= head;
        ListNode Fast= head;
        ListNode Prev=head;
        while(Fast != null && Fast.next != null){
            Prev=Slow;
            Slow=Slow.next;
            Fast=Fast.next.next;
            
        }
        Prev.next=Prev.next.next;
        return head;

    }
}