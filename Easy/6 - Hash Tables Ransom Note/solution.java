import java.util.ArrayList;
import java.util.List;

class Result {
    public static void checkMagazine(List<String> magazine, List<String> note) {
        HashMap<String, Integer> magazineMap = new HashMap<>();

        for (String magazineWord : magazine) {
            if (magazineMap.containsKey(magazineWord)) {
                int counter = magazineMap.get(magazineWord);
                magazineMap.replace(magazineWord, ++counter);

                continue;
            }

            magazineMap.put(magazineWord, 1);
        }

        String result = "Yes";

        for (String noteWord : note) {
            if (!magazineMap.containsKey(noteWord)) {
                result = "No";
                break;
            }

            int counter = magazineMap.get(noteWord);

            if (counter <= 0) {
                result = "No";
                break;
            }

            magazineMap.replace(noteWord, --counter);
        }

        System.out.println(result);
    }
}
