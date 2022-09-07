class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap <Integer, Integer> map = new HashMap<>();
        
        Stack<Integer> stack = new Stack<>();
    
        for(int i=0; i< nums2.length; i++){
            int digit = nums2[i];
            while(!stack.isEmpty() && stack.peek()< digit){
                int top = stack.pop();
                map.put(top, digit);
            }
            stack.push(digit);
        }
        
        for(int i=0; i< nums1.length; i++){
            int digit = nums1[i];
            nums1[i] = map.getOrDefault(digit, -1);
        }
        return nums1;
    
    }
}