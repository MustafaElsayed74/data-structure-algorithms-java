package org.example.Algorithms.search;

import java.util.Arrays;

public class BinarySearch {

    //Using Recursion
    public static int search(int[] arr, int target, int l, int r) {
        if (l <= r) {
            int m = (l + r) / 2;
           if(arr[m] == target)
               return m;
            else if (arr[m] < target)
                return search(arr, target, m + 1, r);
            else
                return search(arr, target, l, m - 1);
        }
        return -1;
    }

//          public static int search(int[] arr, int target) {
//        int l = 0;
//        int r = arr.length - 1;
//        int steps = 0;
//        while(l<=r) {
//            steps++;
//        int mid = (l + r) / 2;
//            if (arr[mid] == target) {
//                System.out.println("Number of steps taken by binary: " + steps);
//                return mid;
//            }
//            else if (arr[mid] < target)
//                l = mid + 1;
//            else
//                r = mid - 1;
//        }
//        return -1;
//    }
}
