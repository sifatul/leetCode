class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        
        int i=m-1, j = n-1, p = nums1.length -1;

        while(j>=0){
            
            if(i>=0&&nums1[i]>nums2[j]) nums1[p] = nums1[i--];
            else nums1[p] = nums2[j--];
            p--;
        }
        
        
    }
}