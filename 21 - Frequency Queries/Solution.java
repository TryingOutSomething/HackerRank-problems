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

    static List<Integer> freqQuery(List<List<Integer>> queries) {
        Map<Integer, Integer> bucket = new HashMap<>();
        Map<Integer, Integer> frequency = new HashMap<>();
        List<Integer> results = new ArrayList<>();

        for (List<Integer> q : queries) {
            Integer operation = q.get(0);
            Integer operand = q.get(1);

            switch (operation) {
                case 1:
                    addToBucket(bucket, frequency, operand);
                    continue;
                case 2:
                    deleteFromBucket(bucket, frequency, operand);
                    continue;
                case 3:
                    countBucketForExactMatch(frequency, results, operand);
                    continue;
            }
        }

        return results;
    }

    static void addToBucket(Map<Integer, Integer> bucket, Map<Integer, Integer> frequency, Integer operand) {
        if (bucket.containsKey(operand)) {
            int counter = bucket.get(operand);
            int updatedCounter = bucket.get(operand) + 1;
            bucket.replace(operand, updatedCounter);

            deductFrequencyFromMap(frequency, counter);
            increaseFrequencyInMap(frequency, updatedCounter);

            return;
        }

        bucket.put(operand, 1);
        increaseFrequencyInMap(frequency, 1);
    }

    static void deleteFromBucket(Map<Integer, Integer> bucket, Map<Integer, Integer> frequency, Integer operand) {
        if (bucket.containsKey(operand)) {
            int counter = bucket.get(operand);
            int updatedCounter = counter <= 0 ? 0 : counter - 1;
            bucket.replace(operand, updatedCounter);

            deductFrequencyFromMap(frequency, counter);
            increaseFrequencyInMap(frequency, updatedCounter);

            return;
        }

        bucket.put(operand, 0);
        deductFrequencyFromMap(frequency, 0);
    }

    static void deductFrequencyFromMap(Map<Integer, Integer> bucket, Integer key) {
        if (bucket.containsKey(key)) {
            int counter = bucket.get(key);
            int updatedCounter = counter <= 0 ? 0 : counter - 1;
            bucket.replace(key, updatedCounter);

            return;
        }

        bucket.put(key, 0);
    }

    static void increaseFrequencyInMap(Map<Integer, Integer> bucket, Integer key) {
        if (bucket.containsKey(key)) {
            int counter = bucket.get(key) + 1;
            bucket.replace(key, counter);

            return;
        }

        bucket.put(key, 1);
    }

    static void countBucketForExactMatch(Map<Integer, Integer> frequency, List<Integer> results, Integer operand) {
        if (frequency.containsKey(operand) && frequency.get(operand) > 0) {
            results.add(1);

            return;
        }

        results.add(0);
    }
}
