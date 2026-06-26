class Solution {
    public boolean increasingTriplet(int[] nums) {
         if(nums==null || nums.length<3) return false;
        int lef=Integer.MAX_VALUE;
        int righ=Integer.MAX_VALUE;
        for(int num:nums){
          if(num<=lef) lef=num;
          else if(num<=righ) righ=num;
          else
              return true;

        }
        return false;

    }
        
    
}