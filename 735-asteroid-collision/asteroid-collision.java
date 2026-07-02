class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack= new Stack();
         for (int i : asteroids) {
            boolean isAlive = true;

            while (i < 0 && !stack.isEmpty() && stack.peek() > 0 && isAlive) {

                if (-i  >stack.peek()) {
                    stack.pop();
                } else if (-i == stack.peek()) {
                    stack.pop();
                    isAlive = false;

                } else {
                    isAlive = false;
                }


            }
            if (isAlive) {
                stack.push(i);
            }
        }
        int res[] = new int[stack.size()];
        for(int i=res.length-1;i>=0;i--){
            res[i]=stack.pop();
        }

        return res;

        
    }
}