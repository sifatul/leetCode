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
    public ListNode middleNode(ListNode head) {
        if(head ==null) return head;
        
        int length = 0;
        ListNode copy = head;
     
        while(copy !=null){
            copy = copy.next;
            length ++;
        }
        
        ListNode output = null;
        for(int i=0; i<=length/2 ;i++){
            output = head;
            head= head.next;
        }
        return output;
     
         
        
    }
}