package org.example.search;

public class BinarySearch {


    public static int search(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        int steps = 0;
        while(l<=r) {
            steps++;
        int mid = (l + r) / 2;
            if (arr[mid] == target) {
                System.out.println("Number of steps taken: " + steps);
                return mid;
            }
            else if (arr[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }
}
