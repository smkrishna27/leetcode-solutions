class Solution {
    public int maxProduct(int[] nums) {

        int leftproduct=1;
        int rightproduct=1;
        int result=nums[0];
        int n=nums.length;
        for(int i=0;i<n;i++){
            
            leftproduct=leftproduct==0?1:leftproduct;
            rightproduct=rightproduct==0?1:rightproduct;
            leftproduct*=nums[i];
            rightproduct*=nums[n-i-1];

            result=Math.max(result,Math.max(leftproduct,rightproduct));

            
        }

        return result;
        
    }
}