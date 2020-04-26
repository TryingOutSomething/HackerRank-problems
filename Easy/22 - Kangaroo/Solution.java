public class Solution {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Two test case scenario:
        // If x2 is more than x1 and v2 is more than or equals to v1,
        // Both Kangaroos will never meet as the second one is always faster than the
        // first
        // If not, the number of jumps is determine by this formula:
        // x1 + n * v1 = x2 + n * v2, where n is the number of jumps
        // If the LHS is equal to the RHS, both kangaroos will meet each other

        // To find the number of jumps, we can shift n to one side and the rest to
        // another
        // n = (x1 - x2) / (v2 - v1)
        // If RHS has no remainders, we will be able to determine if both kangaroos will
        // meet or not
        if (x2 > x1 && v2 >= v1 || ((x1 - x2) % (v2 - v1) != 0))
            return "NO";

        return "YES";
    }
}
