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
}
