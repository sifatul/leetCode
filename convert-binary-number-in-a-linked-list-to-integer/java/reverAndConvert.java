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
        int counter = 0, output = 0;
        int [] numbers = new int[30];
        while(head !=null){
            int val = head.val;
            numbers[counter] = val;
            counter ++;
            head = head.next;
        }
 
        
        for(int i=0; i<counter; i++){
            if(numbers[i]>0) output += Math.pow(2,counter-i-1);
        }
        return output;
    }
}