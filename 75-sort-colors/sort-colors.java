class Solution {
    public void sortColors(int[] nums) {
 if (nums == null || nums.length == 0) return;

        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (mid <= right) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, left, mid);
                    left++;
                    mid++;

                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, right);

                    right--;
            }

        }

        
    }
     private  void swap(int[] nums, int left, int mid) {
        int temp = nums[mid];
        nums[mid] = nums[left];
        nums[left] = temp;
    }
}