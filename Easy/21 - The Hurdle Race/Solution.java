public class Solution {

    // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {
        int max = height[0];

        for (int i = 0; i < height.length; i++) {
            if (max < height[i])
                max = height[i];
        }

        return k > max ? 0 : max - k;
    }
}
