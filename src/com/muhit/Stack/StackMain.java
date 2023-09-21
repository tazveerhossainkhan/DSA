                            //LAST IN FAST OUT (LIFO)

package com.muhit.Stack;

public class StackMain {
    public static void main(String[] args) throws StackException {
        DynamicStack stack = new DynamicStack(5);

        stack.push(10);
        stack.push(14);
        stack.push(50);
        stack.push(30);
        stack.push(59);
        stack.push(29);


        System.out.println(stack.pop());
        //System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
