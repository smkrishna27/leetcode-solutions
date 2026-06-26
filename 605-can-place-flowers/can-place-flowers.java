class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

          if (flowerbed.length == 0) {
            return false;
        }
        
        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean leftFlowerBed = i == 0 || flowerbed[i - 1] == 0;
                boolean rightFlower = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;
                if (leftFlowerBed && rightFlower) {
                    flowerbed[i] = 1;
                    count++;
                }

            }


        }

        return count >= n;
        
    }
}