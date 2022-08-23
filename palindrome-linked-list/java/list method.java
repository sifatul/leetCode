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
    // [1,2,3,2,1]
    public boolean isPalindromeList(ArrayList list){
        int size= list.size();
        for(int i=0; i<size/2; i++){
            if(list.get(i) != list.get(size-1-i)) return false;
        }
        return true;
        
    }
    
    public boolean isPalindrome(ListNode head) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        if(head == null || head.next == null) return true;
        
        
        ListNode curr = head;
        while(curr !=null){
            list.add(curr.val);
             
            curr = curr.next;
            
            
        }
        
        // System.out.println(list.size() );
        return isPalindromeList (list);
        
    }
}