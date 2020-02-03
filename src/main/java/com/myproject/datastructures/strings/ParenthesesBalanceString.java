package com.myproject.datastructures.strings;

public class ParenthesesBalanceString {

    public static void main(String args[]) {
        String expression = "[()]{}{[()()]()}";
        char[] ch =  expression.toCharArray();

        boolean isBalanced = checkParenthesesBalance(ch);
        if(isBalanced){
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }

    }

    private static boolean checkParenthesesBalance(char[] ch) {

        Stack stack = new Stack();

        for(char chval:ch) {
            if(chval == '{' || chval == '[' || chval =='('){
                stack.push(chval);
            } else if(chval == '}' || chval == ']' || chval ==')'){
                if(stack.isEmpty()){
                   return false;
                }

               boolean b = isMatched(stack.pop(),chval);
               if(!b) {
                   return false;
               }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    private static boolean isMatched(char pop, char chval) {

        if((pop == '(' && chval == ')') || (pop == '[' && chval == ']') || (pop == '{' && chval == '}')){
            return true;
        }
        return false;

    }

    static class Stack {

         char[] stack = new char[20];
         int top = -1;

         public void push(char val){

             if(top > stack.length-1){
                return ;
             }
             stack[++top] = val;
         }

         public char pop(){
             if(top < 0){
                  return ' ';
              }
              return stack[top--];
         }


         public boolean isEmpty(){
             return (top < 0) ? true: false;
         }


    }

}
