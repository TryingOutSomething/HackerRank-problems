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

class Result {

    public static void countSwaps(List<Integer> a) {
        int noOfSwaps = 0;

        for (int i = 0; i < a.size() - 1; ++i) {
            for (int j = i + 1; j < a.size(); ++j) {
                int current = a.get(i);
                int next = a.get(j);

                if (current <= next)
                    continue;

                current = current ^ next;
                next = current ^ next;
                current = current ^ next;

                a.set(i, current);
                a.set(j, next);
                noOfSwaps++;
            }
        }

        System.out.println("Array is sorted in " + noOfSwaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(a.size() - 1));
    }
}