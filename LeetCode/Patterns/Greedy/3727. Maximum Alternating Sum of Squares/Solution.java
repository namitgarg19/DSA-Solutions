import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
         for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i]= (-1)*nums[i];
            }
        
         }
         Arrays.sort(nums);
        int n = nums.length;
        long sum = 0;

        for (int i = 0; i < n / 2; i++) {
            long x = nums[i];
            sum -= x * x;
        }

        for (int i = n / 2; i < n; i++) {
            long x = nums[i];
            sum += x * x;
        }

        return sum;
    }
}



