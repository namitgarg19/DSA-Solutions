class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
       
        int newsum = 0;

        for (int i = 0; i < nums.length; i++) {
            
            if(newsum==sum-newsum-nums[i]){
                return i;
            }
            newsum += nums[i];
        }
        return -1;
    }
}