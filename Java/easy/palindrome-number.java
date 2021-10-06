class Solution {
    public boolean isPalindrome(int x) {
        String str = x+"";
            char [] arr = str.toCharArray();
            
            for(int i=0;i<arr.length/2;i++){
                if(arr[i] != arr[arr.length-1-i]) return false;
            }
        return true;
    }
}