package org.example;

import org.example.search.BinarySearch;
import org.example.search.LinearSearch;

public class Main {
    public static void main(String[] args) {

        int[] nums = {5, 7, 9, 11, 13, 15, 17};
        int target = 11;

        int result1 = LinearSearch.search(nums,target);
        int result2 = BinarySearch.search(nums,target);

//        if(result1 != -1 || result2 != -1) {
//            System.out.println("Element found using linear search at index: \n" + result1);
//            System.out.println("Element found using binary search at index: " + result2);
//        }
//        else
//            System.out.println("Element not found");
    }
}