class Solution {
    public int largestAltitude(int[] gain) {

        int maxAltitude=0;
        int sumAltitude=0;
        for(int i:gain){
            sumAltitude+=i;
            maxAltitude=Math.max(maxAltitude,sumAltitude);
        }
        return maxAltitude;
        
    }
}