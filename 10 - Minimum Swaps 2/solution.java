import java.util.*;

class Result {
    // None of the solutions are solved by me.
    // It was a great learning experience to understand the algorithms below

    // Solution without the need to sort
    // Solutions adapted from source:
    // https://www.includehelp.com/java-programs/minimum-swaps-required-to-sort-an-array.aspx
    // https://www.geeksforgeeks.org/minimum-number-swaps-required-sort-array/
    static int minimumSwaps(int[] arr) {
        int arrayLength = arr.length;
        int noOfSwaps = 0;

        boolean[] visitedNodes = new boolean[arrayLength];
        Arrays.fill(visitedNodes, false);

        for (int i = 0; i < arrayLength; i++) {
            if (arr[i] == i + 1 || visitedNodes[i])
                continue;

            int j = i;
            int iterations = 0;

            while (!visitedNodes[j]) {
                visitedNodes[j] = true;
                j = arr[j] - 1;
                iterations++;
            }

            if (iterations <= 0)
                continue;

            noOfSwaps += iterations - 1;
        }

        return noOfSwaps;
    }

    // Solution with the need to sort
    // Solution adapted from source:
    // https://www.hackerrank.com/challenges/minimum-swaps-2/forum/comments/458759
    // static int minimumSwaps(int[] arr) {
    // int arrayLength = arr.length;
    // int noOfSwaps = 0;

    // for (int i = 0; i < arrayLength; i++) {
    // if (arr[i] == i + 1)
    // continue;

    // int j = i;
    // while (arr[j] != i + 1) {
    // j++;
    // }

    // arr[i] = arr[i] ^ arr[j];
    // arr[j] = arr[i] ^ arr[j];
    // arr[i] = arr[i] ^ arr[j];

    // noOfSwaps++;

    // }

    // return noOfSwaps;
    // }
}
