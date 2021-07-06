import java.util.*;

class solution {

    public static int luckBalance(int k, List<List<Integer>> contests) {
        int totalLuck = 0;
        List<Integer> importantMatchesLuckList = new ArrayList<>();

        for (int i = 0; i < contests.size(); i++) {
            List<Integer> contest = contests.get(i);

            if (contest.get(1) == 1) {
                importantMatchesLuckList.add(contest.get(0));
            }

            totalLuck += contest.get(0);
        }

        Collections.sort(importantMatchesLuckList);

        if (importantMatchesLuckList.size() > k) {
            for (int i = 0; i < importantMatchesLuckList.size() - k; i++) {
                totalLuck -= 2 * importantMatchesLuckList.get(i);
            }
        }

        return totalLuck;
    }
}
