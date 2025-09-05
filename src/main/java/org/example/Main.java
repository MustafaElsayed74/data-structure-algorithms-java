package org.example;

import org.example.DataStructures.DynamicStack;
import org.example.DataStructures.LinkedList.LinkedList;
import org.example.DataStructures.Stack;

public class Main {


    public static void main(String[] args) {

        DynamicStack stack = new DynamicStack();
//        System.out.println(stack.isEmpty());
        stack.push(2);
        stack.show();

        stack.push(4);

        stack.show();
        stack.push(1);
        stack.show();
        stack.push(8);
        stack.show();
        stack.push(5);
        stack.show();
        stack.push(6);
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();



    }
}