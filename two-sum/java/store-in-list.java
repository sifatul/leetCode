class Solution {
    public int[] twoSum(int[] nums, int target) {
        List <Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            if(list.contains(num)){
                int output[] = { list.indexOf(num), i};
                return  output;
            }else {
                int diff = target - num;
                list.add(diff);
            }
            
               
        }
        return new int [2];
    }
}