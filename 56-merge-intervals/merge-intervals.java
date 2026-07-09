class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return intervals;
         Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
         int[] cur=intervals[0];
         List<int[]> merge=new ArrayList<>(intervals.length);
         for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=cur[1]){
                cur[1]=Math.max(cur[1],intervals[i][1]);
            }else{
                merge.add(cur);
                cur=intervals[i];
            }
         }
         merge.add(cur);

         return merge.toArray(new int [merge.size()][]);
        
    }
}