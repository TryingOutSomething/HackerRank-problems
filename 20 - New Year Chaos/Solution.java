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

class Solution {
    // Solution referenced from:
    // https://www.hackerrank.com/challenges/new-year-chaos/forum/comments/143969
    public static void minimumBribes(List<Integer> q) {
        int noOfBribes = 0;

        for (int i = q.size() - 1; i >= 0; i--) {
            if (q.get(i) - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }

            /**
             * We want to find out if the current person was bribed by others in front of
             * the queue.
             * 
             * To find out how many people has bribed the current person, we compare the
             * queue number of every person from the current person's original position - 2
             * to the current person's position.
             */
            for (int j = Math.max(0, q.get(i) - 2); j < i; j++) {
                if (q.get(j) <= q.get(i))
                    continue;

                noOfBribes++;
            }
        }

        System.out.println(noOfBribes);
    }
}