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
    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        
        HashMap <Integer, Integer> map = new HashMap <Integer, Integer>();
        
        ListNode copy = head;
        while(copy != null){
            int num = copy.val;
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
            copy = copy.next;
        }
        
        ListNode outputHead = new ListNode(0);
        ListNode curr = outputHead;
        while (head != null) {
            if (map.get(head.val) == 1) {
                curr.next = head;
                curr = curr.next;
            }
            
            head = head.next;
        }
        
        curr.next = null;
        return outputHead.next;
        
        
        
    }
}