//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().inversionCount(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
 
    static int inversionCount(int arr[]) {
        // Auxiliary array for merge sort
        int[] temp = new int[arr.length];
        return mergeSortAndCount(arr, temp, 0, arr.length - 1);
    }

    // Modified merge sort to count inversions
    static int mergeSortAndCount(int[] arr, int[] temp, int left, int right) {
        int count = 0;

        if (left < right) {
            // Divide the array into two halves
            int mid = left + (right - left) / 2;

            // Count inversions in the left half
            count += mergeSortAndCount(arr, temp, left, mid);

            // Count inversions in the right half
            count += mergeSortAndCount(arr, temp, mid + 1, right);

            // Count merge step inversions
            count += mergeAndCount(arr, temp, left, mid, right);
        }

        return count;
    }

    // Merge two sorted halves and count inversions
    static int mergeAndCount(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;     // Index for left subarray
        int j = mid + 1;  // Index for right subarray
        int k = left;     // Index for merged array
        int count = 0;

        // Merge the two halves while counting inversions
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];

                // Count inversions
                count += (mid + 1 - i); // All remaining elements in left half are inversions
            }
        }

        // Copy remaining elements of left subarray
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements of right subarray
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy back to the original array
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return count;
    }
}

