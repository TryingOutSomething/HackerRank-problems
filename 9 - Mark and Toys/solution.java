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

    public static int maximumToys(List<Integer> prices, int k) {
        Collections.sort(prices);

        int cumulativeTotal = prices.get(0);

        for (int i = 1; i < prices.size(); ++i) {
            cumulativeTotal += prices.get(i);

            if (cumulativeTotal < k)
                continue;

            return i;
        }

        return -1;
    }
}