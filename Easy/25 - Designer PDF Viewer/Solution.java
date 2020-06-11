import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int designerPdfViewer(int[] h, String word) {
        
        // Possible to use an integer to store the max value in the array h instead
        ArrayList<Integer> valueOfWordList = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            int characterInNumber = word.charAt(i) - 'a';

            valueOfWordList.add(h[characterInNumber]);
        }

        return Collections.max(valueOfWordList) * word.length();
    }
}
