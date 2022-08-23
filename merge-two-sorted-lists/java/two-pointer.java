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
        ListNode outputHead = new ListNode();
        ListNode prev = outputHead;
        
        
        while(list1 !=null && list2 != null){
            if(list1.val< list2.val){
                prev.next = list1;
                list1 = list1.next;
                
                 
            }else{
                prev.next = list2;
                list2 = list2.next;
                 
            }
            prev = prev.next;
        }
        if(list1 !=null) prev.next = list1;
        if(list2 !=null) prev.next = list2;
         
        return outputHead.next;
        
    }
}