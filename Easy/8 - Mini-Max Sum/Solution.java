public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int minValue = arr[0];
        int maxValue = arr[0];
        long totalValue = 0;

        // Find the max and min value by iterating the loop
        // Get the sum as well ans subtract accordingly
        // Long data type for the total is required as integer overflow might occur
        for (int i = 0; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }

            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }

            totalValue += arr[i];
        }

        System.out.println((totalValue - maxValue) + " " + (totalValue - minValue));
    }
}
