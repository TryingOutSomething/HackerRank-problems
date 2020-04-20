import java.util.*;

public class Solution {

    static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c);
        int maxIndex = c.length;
        int cost = 0;
        int counter = k;
        int multiplier = 0;

        for (int i = maxIndex - 1; i >= 0; i--) {
            cost += (multiplier + 1) * c[i];
            counter--;

            if (counter == 0) {
                multiplier++;
                counter = k;
            }
        }

        return cost;
    }
}
