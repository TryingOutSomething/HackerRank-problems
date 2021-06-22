import java.util.*;

class Result {

    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER. The function accepts
     * INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        int arraySize = c.size();
        int i = 0;
        int hops = 0;

        while (i < arraySize - 1) {
            if (c.get(i) == 0)
                i++;

            hops++;
            i++;
        }

        return hops;
    }

}
