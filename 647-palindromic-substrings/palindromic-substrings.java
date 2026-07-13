class Solution {
    public int countSubstrings(String s) {

          int count = 0;
        if (s == null || s.isEmpty()) return 0;
        if (s.length() == 1) return 1;
        int low = 0, high = 0;

        for (int i = 0; i < s.length(); i++) {

            low = i;
            high = i;
            while ( (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high) )) {
                low--;
                high++;

                count++;

            }
            low=i;
            high=i+1;
            while ( (low >= 0 && high < s.length() && s.charAt(high) == s.charAt(low) )) {
                low--;
                high++;
                count++;
            }


        }


        return count;
        
    }
}