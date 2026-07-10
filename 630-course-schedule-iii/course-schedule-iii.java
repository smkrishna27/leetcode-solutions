class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, Comparator.comparingInt(a -> a[1]));
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int time = 0;
        for (int[] course : courses) {
            int duration = course[0];
            int lastDay = course[1];
            pq.add(duration);
            time += duration;

            if (time > lastDay) {
                time-=pq.poll();
            }

        }
        return pq.size();
        
    }
}