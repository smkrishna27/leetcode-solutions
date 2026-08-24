class Solution {
    public int minAddToMakeValid(String s) {
         if(s==null){
            return 0;
         }
         int inBalance=0;
         int additions=0;

         for(char c:s.toCharArray()){

            if(c =='('){
              inBalance++;  
            }else{
                if (inBalance == 0) {
                    additions++; 
                } else {
                    inBalance--; 
                }
         }
         }

         return additions+inBalance;

        
    }
}