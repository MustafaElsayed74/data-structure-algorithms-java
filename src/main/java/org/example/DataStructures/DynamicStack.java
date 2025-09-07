package org.example.DataStructures;

public class DynamicStack {
    int capacity = 2;
    int[] stack = new int[capacity];
    int top = 0;

    public void push(int item) {
        if (size() >= stack.length)
            expand();
        else {
            stack[top] = item;
            top++;
        }
    }

    private void expand() {
        int[] newStack = new int[capacity * 2];
        int length = size();
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
        capacity *= 2;
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
        shrink();
        return value;
    }

    private void shrink() {
        int length = size();
        if (length < capacity / 4) {
            capacity /= 2;

            int[] newStack = new int[capacity];
            System.arraycopy(stack, 0, newStack, 0, length);
            stack = newStack;
        }
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
