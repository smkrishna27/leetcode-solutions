class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.isEmpty())
        return 0;
        if(s.length()==1)
        return 1;

        Set<Character> map = new HashSet<>();
        int maxLen = 0;
        int slow = 0;
        int fast = 0;
        for (fast = 0; fast < s.length(); fast++) {
            char c = s.charAt(fast);
            while (map.contains(c)) {
                map.remove(s.charAt(slow));
                slow++;
            }
            map.add(c);
            maxLen = Math.max(maxLen, fast - slow + 1);
        }
        return maxLen;

    
        
    }
}