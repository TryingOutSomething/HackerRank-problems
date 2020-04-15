public class Solution {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int maxValue = ar[0];
        int count = 0;

        // If a new max value is found, the counter will reset to 1 as it is the only
        // tallest candle that the niece can blow out
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > maxValue) {
                maxValue = ar[i];
                count = 1;
            }

            else if (ar[i] == maxValue) {
                count++;
            }
        }

        return count;
    }
}
