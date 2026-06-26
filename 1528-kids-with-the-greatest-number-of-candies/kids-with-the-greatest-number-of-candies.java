class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         List<Boolean> res = new ArrayList<>(candies.length);
        int  maxCandie=0;
        for(int candy :candies)
        {
            maxCandie = Math.max(maxCandie,candy);
        }
        for(int i = 0; i < candies.length; i++){
            if(candies[i]+extraCandies >= maxCandie){
               res.add(true);
            } else{
                res.add(false);
            }

        }

        return res;
        
    }
}