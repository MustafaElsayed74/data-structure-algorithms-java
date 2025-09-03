package org.example.DataStructures;

public class LinkedList {
    Node head;

    public void insert(int value) {
        Node node = new Node();

        node.value = value;

        if (head == null)
            head = node;
        else {
            Node n = head;
            while (n.next != null)
                n = n.next;
            n.next = node;
        }
    }

    public void show() {
        Node node = head;

        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }

    public void insertAtStart(int value){

        Node node  = new Node();

        node.value = value;
        // Making the next to refer to the last head
        node.next = head;
        //Making the head to refer to the new node we created
        head = node;
    }
}
