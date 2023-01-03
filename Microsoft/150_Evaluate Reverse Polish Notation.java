//Question no: 150

//Question Name:Evaluate Reverse Polish Notation

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> num=new Stack();
        String po="+-/*";
        String op=null;
        for(int i=0;i<tokens.length;i++){
             if(!(po.contains(tokens[i]))){ 
             num.push(Integer.parseInt(tokens[i]));

             }
             else{
                op=tokens[i];
               if(op.equals("+")){
                 int x=num.pop();
                 int y=num.pop();
                 int result=y+x;
                 num.push(result);
                 
                }
                else if(op.equals("-")){
                 int x=num.pop();
                 int y=num.pop();
                 int result=y-x;
                 num.push(result);
                 
                }
               else if(op.equals("*")){
                 int x=num.pop();
                 int y=num.pop();
                 int result=y*x;
                 num.push(result);
                 
                }
                else if(op.equals("/")){
                 int x=num.pop();
                 int y=num.pop();
                 int result=y/x;
                 num.push(result);
                 
                }
            }
        }
        return num.pop();
    }
}