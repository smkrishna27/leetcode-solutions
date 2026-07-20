class Solution {
    public int maxScore(int[] nums, int k) {

         int sum = 0;
        int start = 0;
        int totalsum = 0;
        for (int num : nums) {
            totalsum += num;

        }

        int size = nums.length - k;

        while (start < size) {
            sum += nums[start++];
        }

        int minWindowSum = sum;
        for (int i = size; i < nums.length; i++) {
            sum += nums[i] - nums[i - size];
            minWindowSum = Math.min(minWindowSum, sum);
        }


        return totalsum - minWindowSum;


    
        
    }
}