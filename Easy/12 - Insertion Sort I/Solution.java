public class Solution {

    // Insertion sort algorithm starts from index 1 of the array and conpares the
    // previous element
    // A swap occurs whenever the current value in the array is smaller than the
    // previous element
    // The sqap will stop when the current element is larger than the previous
    // element

    // For this example, we are required to simulate the sorting of the last element
    // Only 1 loop is required as we are only sorting one element in the array
    // During each iteration, we compare the previous element with the last element
    // in the array.

    static void insertionSort1(int n, int[] arr) {
        int lastArrElement = arr[n - 1];

        for (int j = n - 1; j >= 0; j--) {
            // Using this nethod, we have to handle the case where j reaches to 0 as what if
            // the last element is the smallest value in the array?
            // last element in the array: 1, array = [2, 3, 4, 1]

            // Without this check, j will reach -1 and enter the next if statement, which
            // will throw an out of bound exception as there is no negative index in an
            // array
            if (j == 0 && lastArrElement <= arr[0]) {
                arr[j] = lastArrElement;
                printArray(arr);
                break;
            }

            // If the previous element is larger than the last element in the array, the
            // current element will be replaced by the previous element.
            // This can also be treated as a "right shift"
            if (arr[j - 1] > lastArrElement) {
                arr[j] = arr[j - 1];

                printArray(arr);
            }

            // If the previous element in the array is smalller or equal to the last element
            // in the array, we can replace the current element in the array with the last
            // elenent of the array.
            else {
                arr[j] = lastArrElement;
                printArray(arr);
                break;
            }
        }
    }

    static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}