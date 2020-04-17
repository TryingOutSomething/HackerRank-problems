public class Solution {

    static void insertionSort2(int n, int[] arr) {
        for (int pivotIndex = 1; pivotIndex < n; pivotIndex++) {
            for (int currentIndex = pivotIndex; currentIndex > 0; currentIndex--) {
                int previousIndex = currentIndex - 1;

                int previousElement = arr[currentIndex - 1];
                int currentElement = arr[currentIndex];

                if (currentElement < previousElement) {
                    int temp = arr[currentIndex];
                    arr[currentIndex] = arr[previousIndex];
                    arr[previousIndex] = temp;
                } else {
                    break;
                }
            }
            printArray(arr);
        }

    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }
        System.out.println();
    }
}