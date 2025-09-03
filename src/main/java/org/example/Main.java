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
        list.insertAtStart(7);
        list.insertAt(3, 18);

        list.show();

    }
}