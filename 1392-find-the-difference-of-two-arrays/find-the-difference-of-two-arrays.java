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
       Set result1=set1.stream().filter(x -> !set2.contains(x)).collect(Collectors.toSet());
        Set result2=set2.stream().filter(x -> !set1.contains(x)).collect(Collectors.toSet());
        res.add(result1.stream().toList());
        res.add((result2.stream().toList()));
        return res;
        
    }
}