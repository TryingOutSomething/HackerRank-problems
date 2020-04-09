import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Count the number of occurrences for negative, positive nad zero integers in
    // the array and divide by the length

    // Print the result in 6 decimal places
    static void plusMinus(int[] arr) {
        double negativeCount = 0;
        double positiveCount = 0;
        double zeroCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                negativeCount++;
            else if (arr[i] == 0)
                zeroCount++;
            else
                positiveCount++;
        }

        System.out.printf("%.6f \n", positiveCount / arr.length);
        System.out.printf("%.6f \n", negativeCount / arr.length);
        System.out.printf("%.6f \n", zeroCount / arr.length);
    }

    // Rest of the code not included
}
