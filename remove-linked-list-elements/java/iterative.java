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
    public ListNode removeElements(ListNode head, int val) {
        
        
        ListNode output = new ListNode();
        output.next = head;
        
        ListNode prev = output;
        
        while(head !=null){
            
            if(head.val == val) prev.next = head.next;
            else prev = head;
            
            head = head.next;
        }
        
        return output.next;
    }
}