package com.myproject.datastructures.practice.basics;

public class StackExpr {


    public static void main(String args[]){
        String str = "{([])]";

        boolean b = isValid(str);

        if(b){
            System.out.println("it's valid");
        } else {
            System.out.println("its not valid");
        }

    }

    private static boolean isValid(String str) {

        boolean b = false;
        char[] c = str.toCharArray();

        for(char ch:c){
               if(ch =='{' || ch == '[' || ch == '('){
                    Stack.push(ch);
               } else if(ch == '}' || ch == ']' ||ch ==')') {
                   b = isCheck(Stack.pop(),ch);
                   if(b){
                       continue;
                   } else {
                       break;
                   }

               } else {
                    b = false;
                    break;
               }
        }

        return  b;
    }


    public static boolean isCheck(char c1,char c2){

        if((c1 == '(' && c2 ==')') || (c1 == '{' && c2 =='}') || (c1 == '[' && c2 ==']')){
            return true;
        }
        return false;
    }

    static class Stack{

       static char[] stack = new char[5];
       static int top = -1;

        public static void push(char data){
            if(stack.length-1<= top){
                System.out.println("stack is full");
                return;
            }

            stack[++top] = data;
        }


        public static char pop(){
            if(top < 0){
                System.out.println("stack is empty");
                return '$';
            }

            char  c = stack[top];
            --top;
            return c;
        }


        public static boolean isEmpty() {
            if(top == -1){
                return true;
            }
            return false;
        }
    }
}
