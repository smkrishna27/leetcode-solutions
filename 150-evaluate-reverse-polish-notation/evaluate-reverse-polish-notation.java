class Solution {
    public int evalRPN(String[] tokens) {

     Stack<Integer> stack=new Stack();

      for(String token:tokens){
        if(token.equals("+") || token.equals("-")||token.equals("*")||token.equals("/") ){
            int a=stack.pop();
            int b= stack.pop();
            calculate(a,b,token,stack);
        }else{
            stack.push(Integer.parseInt(token));
        }
      }

      return stack.pop();

        
    }

    private void calculate(int a,int b,String token,Stack stack){
        switch(token){
            case "+":
            stack.push(b+a);
            break;
            case "-":
            stack.push(b-a);
            break;
            case "*":
            stack.push(b*a);
            break;
            case "/":
            stack.push(b/a);
            break;
        }
    }
}