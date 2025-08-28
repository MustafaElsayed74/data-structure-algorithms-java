package org.example;

import org.example.search.BinarySearch;
import org.example.search.LinearSearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int nums[] = {1, 4, 6, 8, 11};
//        int nums[] = new int[1000];
        int target = 8;
//        for (int i = 0; i <nums.length ; i++) {
//            nums[i] = (int)(Math.random() * 1000);
//        }

        // in binary search the List must be sored
        Arrays.sort(nums);

//        int result1 = LinearSearch.search(nums,target); // takes 262 steps to find target = 288
        int result2 = BinarySearch.search(nums, target, 0, nums.length - 1); //// takes 10 to steps find target = 288

//        if(result1 != -1 || result2 != -1) {
//            System.out.println("Element found using linear search at index: \n" + result1);
        System.out.println("Element found using binary search at index: " + result2);
//        }
//        else
//            System.out.println("Element not found");
    }
}