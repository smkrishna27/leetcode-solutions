class Solution {
    public boolean uniqueOccurrences(int[] arr) {
         Map<Integer, Integer> map = new HashMap<>(arr.length);
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        Set<Integer> set = new HashSet<>(map.values());

        return set.size() == map.size();

        
    }
}