import java.util.Scanner;

public class akcija {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] costs = new int[n];

        for (int i = 0; i < n; i++) {
            costs[i] = in.nextInt();
        }

        quickSort(costs, 0, n - 1);

        System.out.print("\n" + cost(costs, n));

    }

    public static int cost(int[] costs, int n) {
        int totalCost = 0;

        int start = 0;

        if (n % 3 == 1) {
            start = 1;
            totalCost += costs[0];
            costs = removeTheElement(costs, 0);
        } else if (n % 3 == 2) {
            start = 2;
            totalCost += costs[0] + costs[1];
            costs = removeTheElement(costs, 0);
            costs = removeTheElement(costs, 1);
        }

        n = costs.length;

        for (int i = 0; i < (n / 3); i++) {
            costs = removeTheElement(costs, i * 3);
        }

        for (int i = 0; i < costs.length; i++) {
            totalCost += costs[i];
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

    public static int[] removeTheElement(int[] arr, int index) {

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }

        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }

}