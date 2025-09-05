package org.example.DataStructures;

public class Stack {
    int stack[] = new int[5];
    int top = 0;

    public void push(int value) {
        if (top >= stack.length)
        System.out.println("Stack is full");
        else{
           stack[top] = value;
           top++;
        }
    }

    public void show() {
        for (int i : stack)
            System.out.print(i + " ");
        System.out.println();
    }

    public int pop() {
        if (isEmpty())
            System.out.println("Stack is empty");
        int value = stack[--top];
        stack[top] = 0;
        return value;
    }

    public int peek() {
        return stack[--top];
    }

    public int size() {
        return top;

    }

    public boolean isEmpty() {
        return top <= 0;
    }
}
