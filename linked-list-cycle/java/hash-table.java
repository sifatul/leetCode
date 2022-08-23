/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        Set <ListNode> nodeVisited = new HashSet<>();
        while(head !=null){
            if(nodeVisited.contains(head)) return true;
            else nodeVisited.add(head);
            head = head.next;
        }
        return false;
        
    }
}