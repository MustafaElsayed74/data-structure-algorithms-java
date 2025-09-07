package org.example;

import org.example.DataStructures.DynamicStack;
import org.example.DataStructures.LinkedList.LinkedList;
import org.example.DataStructures.Queue;
import org.example.DataStructures.Stack;

public class Main {


    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.enQueue(5);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(7);
        queue.enQueue(11);

        queue.show();


        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
//        queue.deQueue();
        queue.show();
        queue.enQueue(10);
        queue.show();

        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

    }


}