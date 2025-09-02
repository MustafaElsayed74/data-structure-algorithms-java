package org.example;

import org.example.Algorithms.sorting.MergeSort;

public class Main {


    public static void main(String[] args) {


        int[] nums = {4, 1, 2, 8, 11, 9};

        MergeSort.sort(nums, 0, nums.length - 1);
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}