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
        
        ListNode [] arr = new ListNode[100];
        int length=0;
        while(head !=null){
            arr[length] = head;
            head = head.next;
            length ++;
        }
        
        return arr[length/2];
         
        
    }
}