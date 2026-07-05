class Solution {
    public boolean closeStrings(String word1, String word2) {
         if (word1.length() != word2.length()) return false;

       /*Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            freq1.put(c, freq1.getOrDefault(c, 0) + 1);
        }
        for (char c : word2.toCharArray()) {
            freq2.put(c, freq2.getOrDefault(c, 0) + 1);
        }

        if (!freq1.keySet().equals(freq2.keySet())) return false;

        List<Integer> list1 = new ArrayList<>(freq1.values());
        List<Integer> list2 = new ArrayList<>(freq2.values());

        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2);*/
         int[] freq1 = new int[26];
    int[] freq2 = new int[26];

    for (char c : word1.toCharArray()) freq1[c - 'a']++;
    for (char c : word2.toCharArray()) freq2[c - 'a']++;

    // Check character sets
    for (int i = 0; i < 26; i++) {
        if ((freq1[i] == 0 && freq2[i] != 0) || (freq1[i] != 0 && freq2[i] == 0)) {
            return false;
        }
    }

    Arrays.sort(freq1);
    Arrays.sort(freq2);

    return Arrays.equals(freq1, freq2);
        
    }
}