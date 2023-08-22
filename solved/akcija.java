package solved;

import java.util.Arrays;
import java.util.Scanner;

public class akcija {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] costs = new int[n];

        for (int i = 0; i < n; i++) {
            costs[i] = in.nextInt();
        }

        in.close();

        Arrays.sort(costs);

        System.out.print("\n" + cost(costs, n));

       

        // try {
        // File myObj = new File("/workspace/competitive/testFiles/akcijaTest.txt");
        // Scanner in = new Scanner(myObj);

        // int n = in.nextInt();

        // int[] costs = new int[n];

        // for (int i = 0; i < n; i++) {
        // costs[i] = in.nextInt();
        // }

        // quickSort(costs, 0, n - 1);

        // System.out.print("\n" + cost(costs, n));

        // in.close();
        // } catch (FileNotFoundException e) {
        // System.out.println("An error occurred.");
        // e.printStackTrace();
        // }


    }

    public static long cost(int[] costs, int n) {
        long totalCost = 0;

        if (n % 3 == 1) {
            totalCost += costs[0];
            costs = removeFirstElement(costs);
        } else if (n % 3 == 2) {
            totalCost += costs[0] + costs[1];
            costs = removeFirstElement(costs);
            costs = removeFirstElement(costs);
        }

        n = costs.length;

        for (int i = 1; i < (n / 3) + 1; i++) {
            totalCost += costs[(i * 3) - 1] + costs[(i * 3) - 2];
        }

        return totalCost;
    }

    // A utility function to swap two elements
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // This function takes last element as pivot,
    // places the pivot element at its correct position
    // in sorted array, and places all smaller to left
    // of pivot and all greater elements to right of pivot
    static int partition(int[] arr, int low, int high) {
        // Choosing the pivot
        int pivot = arr[high];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot
            if (arr[j] < pivot) {

                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    // The main function that implements QuickSort
    // arr[] --> Array to be sorted,
    // low --> Starting index,
    // high --> Ending index
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int[] removeFirstElement(int[] arr) {
        int[] newArray = new int[arr.length - 1];

        for (int i = 1; i < arr.length; i++) {
            newArray[i - 1] = arr[i];
        }

        return newArray;
    }

}