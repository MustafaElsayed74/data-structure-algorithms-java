package org.example.DataStructures;

public class Queue {
    int[] queue = new int[5];
    int front;
    int rear;
    int size;

    public void enQueue(int item) {
        queue[rear] = item;
        rear = (rear + 1) % queue.length;
        size++;

    }

    public int deQueue() {

        int item = queue[front];
        queue[front] = 0;
        front = (front + 1) % queue.length;
        size--;
        return item;
    }


    public void show() {
        System.out.println();
        for (int item : queue)
            System.out.print(item + " ");
        System.out.println();
    }

    public void peek() {
        if (front <= rear) {
            System.out.println(queue[rear - front]);
            front--;
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }
}
