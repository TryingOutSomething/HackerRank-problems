import java.util.*;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER. The function accepts following
     * parameters: 1. INTEGER n 2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        HashMap<Integer, Integer> sockColourCounterMap = new HashMap<Integer, Integer>();
        int noOfPairs = 0;

        for (int colour : ar) {
            if (!sockColourCounterMap.containsKey(colour)) {
                sockColourCounterMap.put(colour, 1);
                continue;
            }

            int counterForSockColour = sockColourCounterMap.get(colour);
            sockColourCounterMap.replace(colour, ++counterForSockColour);

            if (counterForSockColour % 2 == 1)
                continue;

            noOfPairs++;
        }

        return noOfPairs;
    }

}
