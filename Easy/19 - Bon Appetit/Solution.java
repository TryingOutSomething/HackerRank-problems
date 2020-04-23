import java.util.*;

public class Solution {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int total = 0;

        for (int i = 0; i < bill.size(); i++) {
            if (i == k)
                continue;

            total += bill.get(i);
        }

        int splitBill = total / 2;

        // Using Stream.reduce instead
        // int total = bill.stream().reduce(0, (a, c) -> a + c);
        // int splitBill = (total - bill.get(k)) / 2;

        int scam = b - splitBill;

        if (scam == 0)
            System.out.println("Bon Appetit");
        else
            System.out.println(scam);
    }

    static int add(int a, int b) {
        return a + b;
    }
}
