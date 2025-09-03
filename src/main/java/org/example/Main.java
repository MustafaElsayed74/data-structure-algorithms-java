package org.example;

import org.example.Algorithms.sorting.MergeSort;
import org.example.DataStructures.LinkedList;

public class Main {


    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insert(5);
        list.insert(12);
        list.insert(6);
        list.insert(9);
        list.insert(8);
//        list.insertAtStart(7);
//        list.insertAt(0, 18);
        list.deleteAt(2);

        list.show();

    }
}