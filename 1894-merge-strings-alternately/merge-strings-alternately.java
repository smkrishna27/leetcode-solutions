class Solution {
    public String mergeAlternately(String word1, String word2) {

        if (word1.isEmpty() && word2.isEmpty())
            return word1;

        if (word1.isEmpty())
            return word2;
        if (word2.isEmpty())
            return word1;

        StringBuilder sb = new StringBuilder();
        int length = Math.min(word1.length(), word2.length());
        int i = 0;
        while (i < length) {
            sb.append(word1.charAt(i)).append(word2.charAt(i));
            i++;
        }
        while (i < word1.length()) {
            sb.append(word1.charAt(i));
            i++;
        }
        while (i < word2.length()) {
            sb.append(word2.charAt(i));
            i++;
        }
        
        return sb.toString();


        
    }
}