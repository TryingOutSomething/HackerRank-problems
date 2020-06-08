import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    static int birthday(List<Integer> s, int d, int m) {

        int total = 0;

        // Length of the outer loop is length of array - # of months + 1
        // as we are only interested how many "chunks" we can divide the 
        // array into. The remaining elements can be ignored
        for (int i = 0; i < s.size() - m + 1; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += s.get(j + i);
            }
            
            if (sum == d) total++;
        }

        return total;
    }
}
