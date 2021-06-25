import java.util.ArrayList;
import java.util.List;

class Result {
    private static List<Integer[]> offsets = Arrays.asList(
			new Integer[] { -1, -1 }, // top left
            new Integer[] { -1, 0 }, // top mid
            new Integer[] { -1, 1 }, // top right
            new Integer[] { 1, -1 }, // bottom left
            new Integer[] { 1, 0 }, // bottom mid
            new Integer[] { 1, 1 } // bottom right
    );

    public static int hourglassSum(List<List<Integer>> arr) {
        int rowLength = arr.size();
        int colLength = arr.get(0).size();
        int highestValue = -99999;

        for (int row = 1; row < rowLength - 1; row++) {
            for (int col = 1; col < colLength - 1; col++) {
                int hourglassSumResult = calculateSum(row, col, arr);

                if (hourglassSumResult <= highestValue)
                    continue;

                highestValue = hourglassSumResult;
            }
        }

        return highestValue;
    }

    private static int calculateSum(int startRowIndex, int startColIndex, List<List<Integer>> arr) {
        int totalSum = 0;

        for (int i = 0; i < offsets.size(); i++) {
            int offsetRow = startRowIndex - offsets.get(i)[0];
            int offsetCol = startColIndex - offsets.get(i)[1];

            totalSum += arr.get(offsetRow).get(offsetCol);
        }

        return totalSum + arr.get(startRowIndex).get(startColIndex);
    }
}
