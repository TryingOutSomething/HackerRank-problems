import java.util.ArrayList;
import java.util.List;

class Result {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        ArrayList<Integer> rotatedList = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            int offsetIndex = (i + d) % a.size();

            rotatedList.add(a.get(offsetIndex));
        }

        return rotatedList;
    }
}
