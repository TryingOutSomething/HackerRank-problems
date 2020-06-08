import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int total = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                if ((ar[i] + ar[j]) % k == 0) total++;
            }
        }

        return total / 2;
    }
}
