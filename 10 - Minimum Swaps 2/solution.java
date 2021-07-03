import java.util.*;

class Result {
    public static int makeAnagram(String a, String b) {
        int[] alphabetsTracker = new int[26];
        Arrays.fill(alphabetsTracker, 0);

        for (char c : a.toCharArray())
            ++alphabetsTracker[c - 'a'];
        for (char d : b.toCharArray())
            --alphabetsTracker[d - 'a'];

        int deletions = 0;

        for (int i = 0; i < alphabetsTracker.length; i++)
            deletions += Math.abs(alphabetsTracker[i]);

        return deletions;
    }
}
