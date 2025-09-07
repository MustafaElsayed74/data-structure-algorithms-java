package org.example.DataStructures.LinkedList;

public class LinkedList {
    Node head;

    public void insert(int item) {
        Node node = new Node();

        node.item = item;

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
            System.out.print(node.item + " ");
            node = node.next;
        }
    }

    public void insertAtStart(int item) {

        Node node = new Node();

        node.item = item;
        // Making the next to refer to the last head
        node.next = head;
        // Making the head to refer to the new node we created
        head = node;
    }

    public void insertAt(int index, int item) {

        Node node = new Node();

        node.item = item;
        Node n = head;
        int counter = 0;

        if (index == 0)
            insertAtStart(item);
        else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }

            node.next = n.next;
            n.next = node;
        }

    }

    public void deleteAt(int index) {
        Node n = head;
        if(index == 0 ){
            head = n.next;
        }
        else{
            for(int i=0; i<index-1;i++){
                n = n.next;
            }
                n.next = n.next.next;
        }




    }
}
