package org.example;

import org.example.search.BinarySearch;
import org.example.search.LinearSearch;
import org.example.sorting.*;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {


        int[] nums = {4, 1, 2, 8, 11, 9};

        MergeSort.sort(nums, 0, nums.length - 1);
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}