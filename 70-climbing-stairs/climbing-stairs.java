class Solution {
    public int climbStairs(int n) {
        if(n<2) return n;
        int a=1,b=2;
        for(int i=3;i<=n;i++){
            int c=a+b; //3
            a=b; //2
            b=c; //3
        }

        return b;


        
    }
}