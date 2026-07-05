class Solution {
    public int maxOperations(int[] nums, int k) {
         int operations = 0;
        Arrays.sort(nums);
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                operations++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }


        }
        return operations;
        
    }
}