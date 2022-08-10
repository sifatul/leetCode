class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0; i<nums.length; i++){

            for(int j=i+1; j<nums.length ; j++){                 
                int remain = target - nums[i] -nums[j];
                if(remain == 0) return new int []{i, j};
            }    
        }
        return new int [2];
    }
}