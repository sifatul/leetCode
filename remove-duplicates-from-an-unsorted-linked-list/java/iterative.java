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
        
        ListNode outputHead = new ListNode();
        outputHead.next = head;
        ListNode prev = outputHead;
        ListNode curr = outputHead.next;
        
        
        while(curr !=null){
            int num = curr.val;
            int count = map.get(num);
            if(count>1){
                prev.next = curr.next;
                curr.next = null;
                curr = prev;
            }
            prev= curr;
            curr = curr.next;
            
        }
        return outputHead.next;
        
        
        
    }
}