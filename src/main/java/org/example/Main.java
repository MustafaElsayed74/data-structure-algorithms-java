package org.example;

import org.example.DataStructures.LinkedList.LinkedList;
import org.example.DataStructures.Stack;

public class Main {


    public static void main(String[] args) {

        Stack stack = new Stack();
//        System.out.println(stack.isEmpty());
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(8);
        stack.push(5);
        stack.push(5);
        //stack.push(7);
//        stack.show();
//        System.out.println();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.isEmpty());
//        stack.show();
//        System.out.println(stack.peek());
//        System.out.println(stack.size());


    }
}