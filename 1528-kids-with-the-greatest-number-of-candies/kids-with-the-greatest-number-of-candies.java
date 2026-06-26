class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         List<Boolean> res = new ArrayList<>(candies.length);
       int[] candidness = Arrays.copyOf(candies, candies.length);
       Arrays.sort(candidness);
       int maxCandie = candidness[candidness.length-1];
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