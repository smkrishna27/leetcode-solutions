class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int j : nums1) {
            set1.add(j);
        }
        for (int j : nums2) {
            set2.add(j);
        }
    Set<Integer> result1 = new HashSet<>(set1);
    result1.removeAll(set2);

    Set<Integer> result2 = new HashSet<>(set2);
    result2.removeAll(set1);

    res.add(new ArrayList<>(result1));
    res.add(new ArrayList<>(result2));

    return res;
        
    }
}