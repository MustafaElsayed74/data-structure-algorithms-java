package org.example;

import org.example.search.BinarySearch;
import org.example.search.LinearSearch;
import org.example.sorting.BubbleSort;
import org.example.sorting.InsertionSort;
import org.example.sorting.SelectionSort;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {



        int[] nums = {4, 1, 2, 8, 11, 9, 10};

        InsertionSort.sort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}