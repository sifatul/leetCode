class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap <Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i< nums2.length; i++){
            map.put(nums2[i],i);
        }
        
        
        
        for(int i=0; i< nums1.length; i++){
            int num = nums1[i];
            nums1[i]= -1;
            
            int idxNum = map.getOrDefault(num,-1);
            if(idxNum<0) continue;
            
            
            for(int j=idxNum+1; j<nums2.length; j++){
                
                 if(nums2[j]> num){
                    nums1[i] = nums2[j];
                    break;
                }
                
            }
            
        }
        return nums1;
        
    }
}