public class Solution {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int maxScore = scores[0];
        int minScore = scores[0];
        int maxScoreCount = 0;
        int minScoreCount = 0;

        for (int i = 0; i < scores.length; i++) {
            if (maxScore < scores[i]) {
                maxScore = scores[i];
                maxScoreCount++;
                continue;
            }
            if (minScore > scores[i]) {
                minScore = scores[i];
                minScoreCount++;
            }
        }

        int[] result = { maxScoreCount, minScoreCount };

        return result;
    }
}
