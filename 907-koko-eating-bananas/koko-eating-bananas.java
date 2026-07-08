class Solution {
    public int minEatingSpeed(int[] piles, int h) {
     int lo = 1, hi = Arrays.stream(piles).max().getAsInt();
        while (lo < hi) {
        int mid = lo + (hi - lo) / 2;
        if (canFinish(piles, h, mid)) hi = mid; 
        else lo = mid + 1;
        }
        return lo;
    }
    private boolean canFinish(int[] piles, int h, int speed) {
        long hours = 0;
        for (int p : piles) hours += (p + speed - 1) / speed; // ceiling division
        return hours <= h;
}
}