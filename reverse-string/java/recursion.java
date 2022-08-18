class Solution {
    
    
    public void reverse(char[] s, int left, int right){
        if(left>right) return;
         
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
             
            reverse(s, ++left, --right);
                
         
    }
    public void reverseString(char[] s) {
        
         reverse(s, 0, s.length-1);
        
    }
}