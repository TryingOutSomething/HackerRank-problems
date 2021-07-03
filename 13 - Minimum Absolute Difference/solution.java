import java.util.*;

class Result {

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        List<Integer> absDiff = new ArrayList<>();
        Collections.sort(arr);

        for (int i = 0; i < arr.size() - 1; i++) {
            absDiff.add(Math.abs(arr.get(i) - arr.get(i + 1)));
        }

        return Collections.min(absDiff);
    }
}
