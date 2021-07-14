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

    public static String isValid(String s) {
        if (s.isEmpty())
            return "NO";
        if (s.length() <= 3)
            return "YES";

        int[] frequency = new int[26];

        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
        }

        Arrays.sort(frequency);

        int j = 0;
        while (frequency[j] == 0)
            j++;

        int minFrequency = frequency[j];
        int maxFrequency = frequency[25];

        for (int i = j; i < 26; i++) {
            System.out.println(frequency[i]);
        }

        if (minFrequency == maxFrequency ||
        // To handle cases like 1,1,1,2 where only the max is more then the rest by 1
        // after sorting the array
                maxFrequency - minFrequency == 1 && maxFrequency > frequency[24] ||
                // To handle cases like 1,2,2,2 where only the min is more then the rest by 1
                // after sorting the array
                minFrequency == 1 && frequency[j + 1] == maxFrequency)
            return "YES";

        return "NO";
    }
}
