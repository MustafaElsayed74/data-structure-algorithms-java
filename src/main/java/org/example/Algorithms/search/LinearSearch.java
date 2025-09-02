package org.example.Algorithms.search;

public class LinearSearch {



    public static int search(int[] arr, int target) {

        int steps = 0;
        for (int i = 0; i < arr.length; i++) {
            steps++;
            if (arr[i] == target) {
                System.out.println("Number of steps taken by linear: " + steps);
                return i;
            }

        }
        return -1;
    }


}



