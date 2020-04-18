import java.util.*;

class Result {

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        int lcmResult = findLcm(a);
        int gcdResult = findGcd(b);

        int counter = 0;

        // Count the number of multiples of LCM that evenly divides the GCD
        for (int i = lcmResult; i <= gcdResult; i += lcmResult) {
            if (gcdResult % i == 0)
                counter++;
        }

        return counter;
    }

    private static int findLcm(List<Integer> array) {
        int lcmResult = array.get(0);

        for (int i = 1; i < array.size(); i++) {
            lcmResult = lcm(lcmResult, array.get(i));
        }
        System.out.println(lcmResult);

        return lcmResult;
    }

    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    private static int findGcd(List<Integer> array) {
        int gcdResult = array.get(0);

        for (int i = 1; i < array.size(); i++) {
            gcdResult = gcd(gcdResult, array.get(i));
        }
        System.out.println(gcdResult);

        return gcdResult;
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

}